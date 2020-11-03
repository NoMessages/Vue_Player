var app = new Vue({
    el: "#app",
    data: {
        //歌曲名称
        city: "",
        //歌曲数组
        arr: [],
        //歌曲地址
        url: "",
        //图片地址
        imgUrl: "",
        //作者名称
        name: "",
        //歌词
        lyric: "",
        //评论用户头像,
        userImg: [],
        //用户评论
        hotComments: []
            //
    },
    methods: {
        getjoke: function() {
            var that = this;
            axios.get("https://autumnfish.cn/search?keywords=" + this.city).then(function(response) {
                that.arr = response.data.result.songs;
            }).catch(function(error) {
                console.log(error);
            });
        },
        fun: function(i, a, b) {
            this.name = a + "-" + b;
            var that = this;

            axios.get("https://autumnfish.cn/song/url?id=" + i).then(function(response) {
                that.url = response.data.data[0].url;
            }).catch(function(error) {
                console.log(error);
            })
            axios.get("https://autumnfish.cn/song/detail?ids=" + i).then(function(response) {
                that.imgUrl = response.data.songs[0].al.picUrl;
                var box = document.getElementById("box");
                box.style.backgroundImage = "url(" + that.imgUrl + ")";
            }).catch(function(error) {
                console.log(error);
            });
            // axios.get("https://autumnfish.cn/lyric?id=" + i).then(function(response) {
            //     that.lyric = response.data.lrc.lyric.split("\n");
            // }).catch(function(error) {
            //     console.log(error);
            // });
            axios.get("https://autumnfish.cn/comment/hot?type=0&id=" + i)
                .then(function(response) {
                    that.hotComments = response.data.hotComments
                    console.log(that.hotComments)
                    console.log("Query OK!!!");
                })
                .catch(function(error) {
                    console.log("异常" + error);
                })
        },
    }
});