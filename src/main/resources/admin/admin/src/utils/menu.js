const menu = {
  list() {
    return [
      {
        backMenu: [
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "商家",
                menuJump: "列表",
                tableName: "shangjia",
              },
            ],
            menu: "商家管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "用户",
                menuJump: "列表",
                tableName: "yonghu",
              },
            ],
            menu: "用户管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "商品分类",
                menuJump: "列表",
                tableName: "shangpinfenlei",
              },
            ],
            menu: "商品分类管理",
          },
          {
            child: [
              {
                buttons: ["查看", "修改", "删除", "查看评论", "新增", "审核"],
                menu: "商品信息",
                menuJump: "列表",
                tableName: "shangpinxinxi",
              },
            ],
            menu: "商品信息管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "我的收藏管理",
                tableName: "storeup",
              },
            ],
            menu: "我的收藏管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "轮播图管理",
                tableName: "config",
              },
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "客服",
                tableName: "chat",
              },
            ],
            menu: "系统管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "已完成订单",
                tableName: "orders/已完成",
              },
              {
                buttons: ["新增", "查看", "修改", "删除", "确认收货"],
                menu: "已发货订单",
                tableName: "orders/已发货",
              },
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "未支付订单",
                tableName: "orders/未支付",
              },
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "已取消订单",
                tableName: "orders/已取消",
              },
              {
                buttons: ["新增", "查看", "修改", "删除", "发货"],
                menu: "已支付订单",
                tableName: "orders/已支付",
              },
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "已退款订单",
                tableName: "orders/已退款",
              },
            ],
            menu: "订单管理",
          },
        ],
        frontMenu: [
          {
            child: [
              {
                buttons: ["查看"],
                menu: "商品信息列表",
                menuJump: "列表",
                tableName: "shangpinxinxi",
              },
            ],
            menu: "商品信息模块",
          },
        ],
        hasBackLogin: "是",
        hasBackRegister: "否",
        hasFrontLogin: "否",
        hasFrontRegister: "否",
        roleName: "管理员",
        tableName: "users",
      },
      {
        backMenu: [
          {
            child: [
              {
                buttons: ["查看", "新增", "修改", "删除"],
                menu: "商品信息",
                menuJump: "列表",
                tableName: "shangpinxinxi",
              },
            ],
            menu: "商品信息管理",
          },
          {
            child: [
              {
                buttons: ["新增", "查看", "修改", "删除"],
                menu: "我的收藏管理",
                tableName: "storeup",
              },
            ],
            menu: "我的收藏管理",
          },
          {
            child: [
              {
                buttons: ["查看"],
                menu: "未支付订单",
                tableName: "orders/未支付",
              },
              {
                buttons: ["查看"],
                menu: "已取消订单",
                tableName: "orders/已取消",
              },
              {
                buttons: ["查看", "发货"],
                menu: "已支付订单",
                tableName: "orders/已支付",
              },
              {
                buttons: ["查看"],
                menu: "已退款订单",
                tableName: "orders/已退款",
              },
              {
                buttons: ["查看"],
                menu: "已完成订单",
                tableName: "orders/已完成",
              },
              {
                buttons: ["查看"],
                menu: "已发货订单",
                tableName: "orders/已发货",
              },
            ],
            menu: "订单管理",
          },
        ],
        frontMenu: [
          {
            child: [
              {
                buttons: ["查看"],
                menu: "商品信息列表",
                menuJump: "列表",
                tableName: "shangpinxinxi",
              },
            ],
            menu: "商品信息模块",
          },
        ],
        hasBackLogin: "是",
        hasBackRegister: "是",
        hasFrontLogin: "是",
        hasFrontRegister: "是",
        roleName: "商家",
        tableName: "shangjia",
      },
      {
        backMenu: [
          {
            child: [
              {
                buttons: ["查看", "删除"],
                menu: "我的收藏管理",
                tableName: "storeup",
              },
            ],
            menu: "我的收藏管理",
          },
          {
            child: [
              {
                buttons: ["查看"],
                menu: "未支付订单",
                tableName: "orders/未支付",
              },
              {
                buttons: ["查看"],
                menu: "已取消订单",
                tableName: "orders/已取消",
              },
              {
                buttons: ["查看"],
                menu: "已支付订单",
                tableName: "orders/已支付",
              },
              {
                buttons: ["查看"],
                menu: "已退款订单",
                tableName: "orders/已退款",
              },
              {
                buttons: ["查看"],
                menu: "已完成订单",
                tableName: "orders/已完成",
              },
              {
                buttons: ["查看", "确认收货"],
                menu: "已发货订单",
                tableName: "orders/已发货",
              },
            ],
            menu: "订单管理",
          },
        ],
        frontMenu: [
          {
            child: [
              {
                buttons: ["查看"],
                menu: "商品信息列表",
                menuJump: "列表",
                tableName: "shangpinxinxi",
              },
            ],
            menu: "商品信息模块",
          },
        ],
        hasBackLogin: "是",
        hasBackRegister: "是",
        hasFrontLogin: "是",
        hasFrontRegister: "是",
        roleName: "用户",
        tableName: "yonghu",
      },
    ];
  },
};
export default menu;
