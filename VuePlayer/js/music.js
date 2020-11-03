/* 1:歌曲搜索按口
 请求地址:https://autumnfish. cn/ search
 请求方法:get
 请求乡微:keywords(查询关键宁)
 响应内容:歌曲搜索结果
 */
var musicApp = new Vue({
    el: "#app",
    data: {
        query: "",
        musicList: []
    },
    methods: {
        searchAllMusic: function() {
            axios.get("https://autumnfish.cn/search?keywords='暖暖'")
                .then(function(response) {
                    console.log(response)
                })
                .catch(function(error) {
                    console.log(error);
                })

        }
    },

});