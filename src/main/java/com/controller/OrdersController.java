package com.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.OrdersEntity;
import com.entity.ShangjiaEntity;
import com.entity.ShangpinxinxiEntity;
import com.entity.view.OrdersView;
import com.service.OrdersService;
import com.service.ShangjiaService;
import com.service.ShangpinxinxiService;
import com.utils.MPUtil;
import com.utils.PageUtils;
import com.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;


/**
 * 订单
 * 后端接口
 *
 * @author
 * @email
 * @date 2021-03-20 16:03:02
 */
@RestController
@RequestMapping("/orders")
public class OrdersController {
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private ShangpinxinxiService shangpinxinxiService;
    @Autowired
    private ShangjiaService shangjiaService;


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, OrdersEntity orders,
                  HttpServletRequest request) {
        if (!request.getSession().getAttribute("role").toString().equals("管理员") && !request.getSession().getAttribute("role").toString().equals("商家")) {
            orders.setUserid((Long) request.getSession().getAttribute("userId"));
        }

        if (request.getSession().getAttribute("role").toString().equals("商家")) {

            ShangjiaEntity shangjiaEntity = shangjiaService.selectById((Long) request.getSession().getAttribute("userId"));
            String zhanghao = shangjiaEntity.getZhanghao();
            orders.setZhanghao(zhanghao);

            /*List<ShangpinxinxiEntity> shangpinxinxiEntities = shangpinxinxiService.selectList(
                    new EntityWrapper<ShangpinxinxiEntity>()
                            .in("zhanghao", zhanghao)
            );

            List<Long> goodids  = new ArrayList<>();
            for(ShangpinxinxiEntity s:shangpinxinxiEntities){
                goodids.add(s.getId());
            }*/

        }


        EntityWrapper<OrdersEntity> ew = new EntityWrapper<OrdersEntity>();
        PageUtils page = ordersService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, orders), params), params));

        return R.ok().put("data", page);
    }

    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, OrdersEntity orders, HttpServletRequest request) {
        EntityWrapper<OrdersEntity> ew = new EntityWrapper<OrdersEntity>();
        PageUtils page = ordersService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, orders), params), params));
        return R.ok().put("data", page);
    }

    /**
     * 列表
     */
    @RequestMapping("/lists")
    public R list(OrdersEntity orders) {
        EntityWrapper<OrdersEntity> ew = new EntityWrapper<OrdersEntity>();
        ew.allEq(MPUtil.allEQMapPre(orders, "orders"));
        return R.ok().put("data", ordersService.selectListView(ew));
    }

    /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(OrdersEntity orders) {
        EntityWrapper<OrdersEntity> ew = new EntityWrapper<OrdersEntity>();
        ew.allEq(MPUtil.allEQMapPre(orders, "orders"));
        OrdersView ordersView = ordersService.selectView(ew);
        return R.ok("查询订单成功").put("data", ordersView);
    }

    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id) {
        OrdersEntity orders = ordersService.selectById(id);
        return R.ok().put("data", orders);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id) {
        OrdersEntity orders = ordersService.selectById(id);
        return R.ok().put("data", orders);
    }


    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody OrdersEntity orders, HttpServletRequest request) {
        orders.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(orders);
        orders.setUserid((Long) request.getSession().getAttribute("userId"));
        ordersService.insert(orders);
        return R.ok();
    }

    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody OrdersEntity orders, HttpServletRequest request) {
        orders.setId(new Date().getTime() + new Double(Math.floor(Math.random() * 1000)).longValue());
        //ValidatorUtils.validateEntity(orders);
        ShangpinxinxiEntity shangpinxinxiEntity = shangpinxinxiService.selectById(orders.getGoodid());
        orders.setZhanghao(shangpinxinxiEntity.getZhanghao());
        ordersService.insert(orders);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody OrdersEntity orders, HttpServletRequest request) {
        //ValidatorUtils.validateEntity(orders);
        ordersService.updateById(orders);//全部更新
        return R.ok();
    }


    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids) {
        ordersService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }

    /**
     * 提醒接口
     */
    @RequestMapping("/remind/{columnName}/{type}")
    public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request,
                         @PathVariable("type") String type, @RequestParam Map<String, Object> map) {
        map.put("column", columnName);
        map.put("type", type);

        if (type.equals("2")) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Calendar c = Calendar.getInstance();
            Date remindStartDate = null;
            Date remindEndDate = null;
            if (map.get("remindstart") != null) {
                Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindStart);
                remindStartDate = c.getTime();
                map.put("remindstart", sdf.format(remindStartDate));
            }
            if (map.get("remindend") != null) {
                Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
                c.setTime(new Date());
                c.add(Calendar.DAY_OF_MONTH, remindEnd);
                remindEndDate = c.getTime();
                map.put("remindend", sdf.format(remindEndDate));
            }
        }

        Wrapper<OrdersEntity> wrapper = new EntityWrapper<OrdersEntity>();
        if (map.get("remindstart") != null) {
            wrapper.ge(columnName, map.get("remindstart"));
        }
        if (map.get("remindend") != null) {
            wrapper.le(columnName, map.get("remindend"));
        }
        if (!request.getSession().getAttribute("role").toString().equals("管理员")) {
            wrapper.eq("userid", (Long) request.getSession().getAttribute("userId"));
        }


        int count = ordersService.selectCount(wrapper);
        return R.ok().put("count", count);
    }


}
