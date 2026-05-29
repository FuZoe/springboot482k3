const base = {
    get() {
                return {
            url : "http://localhost:8080/springboot482k3/",
            name: "springboot482k3",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot482k3/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "基于Spring Boot的浏阳特产电子商务平台"
        } 
    }
}
export default base
