package com.iezview.tour.activity.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<DummyItem> ITEMS = new ArrayList<DummyItem>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

    private static final int COUNT = 25;

    static {
        addItem(new DummyItem(String.valueOf(1),
                //驾校名称↓
                "海淀驾校 - 5000¥",
                //描述↓
                "驾校位于海淀区北部风景旅游景区，属海淀区区属大型企业。创建于1985年，占地3000多亩。在同行业中有着悠久的创业史，是北京市乃至全国最大的机动车驾驶员综合培训及服务基地。",
                //图片↓
                "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=8d2725bbb219ebc4c0787691b227cf79" +
                "/d1f9b31bb051f819720e1994dbb44aed2f73e735.jpg"));
        addItem(new DummyItem(String.valueOf(2), "东方时尚驾校 - 5000¥", "世界上有一个最大最长的珊瑚礁群 " +
                "它就是有名的大堡礁- Great Barrier Reef 它纵贯蜿蜒于澳洲的东海岸，全长2011公里 最宽处161公里 南端最远离海岸241公里 " +
                "北端离海岸仅16公里 在落潮时 部分的珊瑚礁露出水面形成珊瑚 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=b0541ac4c75c1038247ececa8210931c" +
                "/45df5982b2b7d0a255f01e43caef76094a369a1a.jpg"));
        addItem(new DummyItem(String.valueOf(3), "公交驾校 - 5000¥", "佛罗里达风景最亮丽的棕榈海滩是全球著名的旅游天堂之一 " +
                "适宜的气候 美丽的海滩 精美的饮食 艺术展览和文艺演出 即使是最挑剔的游客 在棕榈海滩也能满意而归 每年的四月 棕榈海滩的艺术活动是最丰富多彩的 " +
                "包括各种海滩工艺品展览 其中于4月4日启动的棕榈海滩爵士节以展示美国最杰出的爵士音乐而赢得了艺术爱好者 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=ff439cf7eac4b7453494b71efffd1e78" +
                "/5bf0b051f8198618c36cf55a4bed2e738ad4e635.jpg"));
        addItem(new DummyItem(String.valueOf(4), "深港驾校 - 5000¥", "新西兰位于南太平洋 西隔塔斯曼海与澳大利亚相望 " +
                "西距澳大利亚1600公里 东邻汤加 斐济国土面积为二十七万平方公里 海岸线长6900千米 海岸线上有许多美丽的海滩 新西兰主要由南岛和北岛组成库克海峡将两岛分开" +
                " 还有许多较小的岛屿全境多山 山地面积占全国面积的50% 南岛西部绵亘着雄伟的南阿尔卑斯山脉库克峰海拔3764米，为全国最高峰 无论是茂盛的雨林 清澈的湖泊 " +
                "还是绿草茵茵的和山坡水清沙白的海滩 无不显示新西兰的 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=6f2ee9b2113853438ccf8729a312b01f" +
                "/b169b2b7d0a20cf46ba9e40177094b36adaf991a.jpg"));
        addItem(new DummyItem(String.valueOf(5), "龙泉驾校 - 5000¥", "到南非游览 " +
                "千万不可错过到非洲尖端好望角参观的机会好望角距离开普敦约六十公里 是大西洋和印度洋的交汇处其实 好望角是一个突出的小山岬 过去曾被称为暴风角 因为这里的天气恶劣" +
                " 昔日不少航船都在此处遇险但在印度洋航线通航后 闻说当时的葡萄牙王便把她改名为好望角因为登上角点 " +
                "可以眺望到大西洋和印度洋的壮大景色好望角为太平洋与印度洋冷暖流水的分界 气象万变 景象奇妙 耸立于大海 更有高逾二千尺的达卡马峰 危崖峭壁 " +
                "卷浪飞溅，令人大开眼界 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=450fc42ab64543a9f51bfac42e168a7b" +
                "/58baf8198618367a2ca265032f738bd4b21ce535.jpg"));
        addItem(new DummyItem(String.valueOf(6), "蓝天驾校 - 5000¥", "金庙位于印度边境城市阿姆利则 作为锡克教的圣地 " +
                "阿姆利则意为“花蜜池塘” 当年只是印度教改革派分支的锡克教 经过几代教徒的不懈努力 最终于16世纪发展成完全独立的宗教 为此 " +
                "当年锡克教第4代祖师罗姆?达斯曾修建了一座水池 名为“花蜜池塘” 阿姆利则由此得名 而金庙则由锡克教第5代祖师阿尔琼1589年主持建造1601年完工 " +
                "迄今已有400年历史 因该庙门及大小19个圆形寺顶均贴满金箔 在阳光照耀下 分外璀璨夺目 一直以来被锡克人尊称为“上帝之殿”", "http://imgsrc" +
                ".baidu.com/forum/w%3D580/sign=0e47d41cb3119313c743ffb855390c10" +
                "/e41f31adcbef7609163283412fdda3cc7dd99e1a.jpg"));
        addItem(new DummyItem(String.valueOf(7), "丰顺驾校 - 5000¥",
                "在一片乾燥的不毛之地后大地的，突然出现一座金碧辉煌的不夜城 一座不可思议的人工化城市 任何人的目光都被那闪耀的霓虹灯及有特色的豪华风光所吸引 " +
                        "甚至於在完全不同于日常生活的幻境中迷失自我 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=f3179f90cb8065387beaa41ba7dca115" +
                "/9ee24b36acaf2eddc3c853378c1001e93801931a.jpg"));
        addItem(new DummyItem(String.valueOf(8), "通略驾校 - 5000¥", "作为2000年奥运会的主办城市 " +
                "悉尼市的最重要的特征可能就是悉尼港,世界上最著名的海港之一了 悉尼港上美丽的悉尼歌剧院和海港大桥更增加了它的知名度 海港有许多小的海湾 海港和海滩 " +
                "这些都让当地的居民和来自各地的旅游者着迷 悉尼歌剧院和海港大桥是澳大利亚的象征 悉尼歌剧院是公认的20世纪世界七大奇迹之一 是悉尼最容易被认出的建筑 " +
                "它白色的外表 建在海港上的贝壳般的雕塑体 象飘浮在空中的散开的花瓣 多年来一直令人们叹为观止 它内设音乐厅 歌剧场 戏剧场 儿童剧场和一个摄影场 " +
                "每个月甚至每星期这里都要举行拍卖会 音乐会和其它各种活动 是悉尼最受欢迎的地方 海港大桥则是为数不多的得到世界广泛赞誉的大桥 " +
                "这座与众不同的灰色的拱形桥是将悉尼港连接在一起的空中长廊 它高134米 长503米的雄伟身姿也是各类电影电视中的常客 自1930年建成以来 " +
                "海港大桥一直见证着澳大利亚特别是悉尼发展 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=babfadc8cefc1e17fdbf8c397a91f67c" +
                "/de91dab44aed2e7372c29cf28601a18b86d6fa35.jpg"));
        addItem(new DummyItem(String.valueOf(9), "远大驾校 - 5000¥", "除了帝国大厦和自由女神像 " +
                "横跨纽约东河的布鲁克林大桥当数纽约的又一个标志性建筑了 至少在电影和电视画面中 人们对这座以曼哈顿的璀璨灯海为背景的长达487米的悬索桥已经不陌生了 " +
                "除了充当影视作品中的场景外 布鲁克林大桥在过去的120年中还无数次的被艺术家们再现在自己的画布上 " +
                "美国著名诗人克莱恩于1930年发表的诗作《大桥》更是给这座连接纽约曼哈顿半岛和布鲁克林区的双层悬索桥罩上了一层神秘的面纱 ", "http://imgsrc" +
                ".baidu.com/forum/w%3D580/sign=063c2339902397ddd679980c6983b216" +
                "/c636a3cc7cd98d1062ed16ef203fb80e7aec901a.jpg"));
        addItem(new DummyItem(String.valueOf(10), "天保驾校 - 5000¥", "坐落于印度古都阿格的泰姬陵 是世界七大奇迹之一 " +
                "到印度旅游的人士 大都是慕它的盛名而来 这座世界七大建筑奇迹背后其实有一段哀怨缠绵的历史 了解它的历史的背景 确能增加观赏泰姬陵的趣味 " +
                "17世纪莫卧儿帝国皇帝沙杰汉为纪念其爱妃慕塔芝玛动用了数万名工人 以宝石镶饰 修建陵寝 图案之细致令人叫绝 泰姬陵最引人瞩目的是用纯白大理石砌建而成的主体建筑 " +
                "皇陵上下左右工整对称 中央圆顶高六十二米 令人叹为观止 四周有四座高约四十一米的尖塔 塔与塔之间耸立了镶满三十五种不同类型的半宝石的墓碑 陵园占地十七公顷 " +
                "为一略呈长形的圈子 四周围以红沙石墙 进口大门也用红岩砌建 大约两层高 门顶的背面各有十一个典型的白色圆锥形小塔 大门一直通往沙杰罕王和王妃的下葬室 " +
                "室的中央则摆放了他们的石棺 壮严肃穆泰姬陵的前面是一条清澄水道 水道两旁种植有果树和柏树 分别象征生命和死亡 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=71849c309d82d158bb8259b9b00b19d5" +
                "/a9df970a304e251f3547fe26a686c9177d3e53a3.jpg"));
    }

    private static void addItem(DummyItem item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /**
     * A dummy item representing a piece of content.
     */
    public static class DummyItem {
        public final String id;
        public final String content;
        public final String details;
        public final String imagepath;

        public DummyItem(String id, String content, String details, String imagepath) {
            this.id = id;
            this.content = content;
            this.details = details;
            this.imagepath = imagepath;
        }

        @Override
        public String toString() {
            return content;
        }
    }
}
