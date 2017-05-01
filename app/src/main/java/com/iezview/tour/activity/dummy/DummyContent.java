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
        addItem(new DummyItem(String.valueOf(2), "东方时尚驾校 - 5000¥", "东方时尚驾驶学校股份有限公司目前的主营业务是驾驶员培训。北京总公司坐落于北京市大兴区金星西路，占地面积近2000余亩，拥有花园般的环境、酒店式的服务以及世界一流的训练场、考试场和配套设施，现有宝来、桑塔纳、伊兰特和金龙大型客车、中型客车、大型货车、牵引车、摩托车等各种训练用车2000余部，员工4000余人，总资产达24.4亿元。东方时尚是全国第一个“残疾人驾驶汽车训练示范基地”，拥有外籍学员培训资质，年培训学员数量和考试合格率均居驾培行业之首。公安部道路交通安全研究中心与东方时尚建立战略合作关系，联合建立机动车驾驶人考试实验基地，" +
                "开展机动车驾驶人考试和训练研究实验，开展交通安全宣传、考试设备展示和经验交流等活动，开展人才培养和队伍建设。 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=b0541ac4c75c1038247ececa8210931c" +
                "/45df5982b2b7d0a255f01e43caef76094a369a1a.jpg"));
        addItem(new DummyItem(String.valueOf(3), "公交驾校 - 5000¥", "公交驾校始建于1953年，现隶属于北京巴士传媒股份有限公司。于2001年12月通过ISO9001：2000质量管理体系认证。2004年3月改制后更名为北京市公交汽车驾驶学校有限公司。\n" +
                "公交驾校位于大兴区黄村镇狼垡地区，占地700亩，拥有办公楼、综合业务楼、培训业务楼、车辆维修车间、员工学员餐厅、员工文化馆、理论科目考试场等功能性建筑。现有员工1518人，各类车辆869部，招生中心及各城区百余处报名点提供就近报名、上门服务等一费到底的一条龙式消费服务。办公区域有花园及文化长廊与绿荫覆盖的训练场连接，环境优美、设施完备、科目齐全，可同时容纳千余部教练车训练、考试，是场校合一的大型国有现代化星级驾校。全校员工以优质规范的全新服务提升品牌形象，保持在驾校行业中的名校地位，是北京市质量协会推荐的“行业代表”、" +
                "“质量A级单位”、“用户满意企业”、“中国驾驶行业十大影响力品牌”和“文明诚信、优质服务”示范单位。 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=ff439cf7eac4b7453494b71efffd1e78" +
                "/5bf0b051f8198618c36cf55a4bed2e738ad4e635.jpg"));
        addItem(new DummyItem(String.valueOf(4), "深港驾校 - 5000¥", "作为国内最早涉足学车驾培行业的企业之一，深圳市深港驾培集团历经近二十年的稳健发展，已发展成为注册资本过亿元，集驾驶培训、大型训考场建设及运营、专业陪驾自驾游服务等多位一体的集团化、产业链式连锁发展企业。深圳市深港驾培集团是全国首家以集团化运" +
                "营、首家注册资本过亿的驾培企业，也是全国教练车台数最多、连锁运营规模最大的驾培企业。 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=6f2ee9b2113853438ccf8729a312b01f" +
                "/b169b2b7d0a20cf46ba9e40177094b36adaf991a.jpg"));
        addItem(new DummyItem(String.valueOf(5), "龙泉驾校 - 5000¥", "北京龙泉机动车驾驶员培训中心成立于1992年，同年正式招收培训学员。至今，北京龙泉机动车驾驶员培训中心已成为京城资历最老，规模最大，师资最强，学员最多的旗舰型驾驶员培训学校之一。此外，北京龙泉机动车驾驶员培训中心以其独一无二的花园式训练场和距京城市中心最近的地理优势独享天时地利。龙泉驾校在北京市保护消费者权益调查驾驶行业中被学员评为实际消费首选品牌、心目中" +
                "理想品牌。被市交管局评为先进驾校，“北京青年报”评为明星驾校，“北京工人报”评为十佳驾校。 ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=450fc42ab64543a9f51bfac42e168a7b" +
                "/58baf8198618367a2ca265032f738bd4b21ce535.jpg"));
        addItem(new DummyItem(String.valueOf(6), "蓝天驾校 - 5000¥", "江西蓝天驾校创建于2004年，是江西省国家一类驾驶员培训机构。经过十几年的科学发展，其鲜明的办学特色和突出的办学 成绩得到了社会各界的广泛关注和赞誉，被授予“中国道路运输协会优秀会员单位”、荣获了“全国文明诚信优质服务示范单位”、“全国文明诚信优质服务驾 校”、“江西省机动车驾驶员培训行业协会会长单位”、“江西省示范性驾校”、“江西省职业教育先进单位”、“江西省十强驾校”之首、江西十佳教育培训单 位、“AAA”级优秀驾校、“江西省先进基层党组织”、江西省教育系统“工人先锋号”，被江西省团委和江西省学联" +
                "首个授予“江西省大学生素质拓展训练技能 培训基地”。", "http://imgsrc" +
                ".baidu.com/forum/w%3D580/sign=0e47d41cb3119313c743ffb855390c10" +
                "/e41f31adcbef7609163283412fdda3cc7dd99e1a.jpg"));
        addItem(new DummyItem(String.valueOf(7), "丰顺驾校 - 5000¥",
                "中华人民共和国公安部认证考试场 北京市公安局公安交通管理局授予的星级驾校\n" +
                        "北京市公安局公安交通管理局指定涉外培训单位 梅赛德斯-奔驰驾驶学院中国战略合作伙伴\n" +
                        "三环路旁，丽泽桥畔，紧邻北京丽泽商务区，31条公交线路和地铁9号线、10号线西局交汇处，一所北京市交管局认证合格、集理论培训、场内道路及实际道路训练、考试为一体的花园式驾驶培训基地就在您身边。\n" +
                        "一帆风顺的车旅，从丰顺驾校开始！ ", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=f3179f90cb8065387beaa41ba7dca115" +
                "/9ee24b36acaf2eddc3c853378c1001e93801931a.jpg"));
        addItem(new DummyItem(String.valueOf(8), "通略驾校 - 5000¥", "上海通略驾校集团下属通略驾校和阳浦驾校。是由上海市公安局交警总队、上海城市交通局批准并经工商局正式注册的专业化机动车驾驶员培训学校。下属通略驾" +
                "校和通略阳浦驾校，统称“通略驾校”。", "http://imgsrc.baidu" +
                ".com/forum/w%3D580/sign=babfadc8cefc1e17fdbf8c397a91f67c" +
                "/de91dab44aed2e7372c29cf28601a18b86d6fa35.jpg"));
        addItem(new DummyItem(String.valueOf(9), "远大驾校 - 5000¥", "  北京市海淀区远大汽车驾驶学校由北京远大智库信息科技有限公司进行招生，运营，培训等工作\n" +
                "     北京市海淀区远大汽车驾驶学校（以下简称远大驾校）注册成立于1984年，是当时京城屈指可数的几家驾校之一。建校20多年来已培养了数十万名合格的汽车驾驶员，其中，许多人已成为党政机关领导干部、著名企业家、社会知名人士。尤其是我国航天员、公安民警和在校大学生都把远大" +
                "驾校作为他们学车的首选。", "http://imgsrc" +
                ".baidu.com/forum/w%3D580/sign=063c2339902397ddd679980c6983b216" +
                "/c636a3cc7cd98d1062ed16ef203fb80e7aec901a.jpg"));
        addItem(new DummyItem(String.valueOf(10), "天保驾校 - 5000¥", "南京天保桥驾驶员培训学校（简称天保驾校）创建于1990年，总校在城南天保桥训练基地，天保驾校有着十多年的办学历史和经验，是南京驾校中培训规模最大、通过率最高的驾校之一，天保的培训质量始终居同行业领先水平，年培训规模达2万余人，受到了学员的一致认可，并第一个向社会郑重承诺：“学员领取驾照后能在新街口、鼓楼、山西路等市区繁" +
                "华地段独立安全驾驶!”...", "http://imgsrc.baidu" +
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
