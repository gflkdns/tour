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
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493719815294&di=c9799747d494329fa5768831b5d34967&imgtype=0&src=http%3A%2F%2Fuplo" +
                        "ad4.hlgnet.com%2Fbbsupfile%2F2011%2F2011-08-22%2F20110822162705_11.jpg"));
        addItem(new DummyItem(String.valueOf(2), "东方时尚驾校 - 5000¥", "东方时尚驾驶学校股份有限公司目前的主营业务是驾驶员培训。北京总公司坐落于北京市大兴区金星西路，占地面积近2000余亩，拥有花园般的环境、酒店式的服务以及世界一流的训练场、考试场和配套设施，现有宝来、桑塔纳、伊兰特和金龙大型客车、中型客车、大型货车、牵引车、摩托车等各种训练用车2000余部，员工4000余人，总资产达24.4亿元。东方时尚是全国第一个“残疾人驾驶汽车训练示范基地”，拥有外籍学员培训资质，年培训学员数量和考试合格率均居驾培行业之首。公安部道路交通安全研究中心与东方时尚建立战略合作关系，联合建立机动车驾驶人考试实验基地，开展机动车驾驶人考试和训练" +
                "研究实验，开展交通安全宣传、考试设备展示和经验交流等活动，开展人才培养和队伍建设。",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493719962634&di=1f5523c3696e16f8a754f8fe9f3407ec&imgtype=0&src=http%3A%2F" +
                        "%2Fautocity.sinaimg.cn%2F2014%2F0811%2FU10682P1442DT20140811180809.jpg"));
        addItem(new DummyItem(String.valueOf(3), "公交驾校 - 5000¥", "公交驾校始建于1953年，现隶属于北京巴士传媒股份有限公司。于2001年12月通过ISO9001：2000质量管理体系认证。2004年3月改制后更名为北京市公交汽车驾驶学校有限公司。\n" +
                "公交驾校位于大兴区黄村镇狼垡地区，占地700亩，拥有办公楼、综合业务楼、培训业务楼、车辆维修车间、员工学员餐厅、员工文化馆、理论科目考试场等功能性建筑。现有员工1518人，各类车辆869部，招生中心及各城区百余处报名点提供就近报名、上门服务等一费到底的一条龙式消费服务。办公区域有花园及文化长廊与绿荫覆盖的训练场连接，环境优美、设施完备、科目齐全，可同时容纳千余部教练车训练、考试，是场校合一的大型国有现代化星级驾校。全校员工以优质规范的全新服务提升品牌形象，保持在驾校行业中的名校地位，是北京市质量协会推荐的“行业代表”、“质量A级单位”、“用户满意企业”、“" +
                "中国驾驶行业十大影响力品牌”和“文明诚信、优质服务”示范单位。",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493720024420&di=cca82ccf0d4f09710ee4f180b1548c11&imgtype=0&s" +
                        "rc=http%3A%2F%2Fimgsrc.baidu.com%2Fbaike%2Fpic%2Fitem%2Ff7426d8dba11e60fb31bbaa1.jpg"));
        addItem(new DummyItem(String.valueOf(4), "深港驾校 - 5000¥", "   作为国内最早涉足学车驾培行业的企业之一，深圳市深港驾培集团历经近二十年的稳健发展，已发展成为注册资本过亿元，集驾驶培训、大型训考场建设及运营、专业陪驾自驾游服务等多位一体的集团化、产业链式连锁发展企业。深圳市深港驾培集团是全国首家以集团化运营" +
                "、首家注册资本过亿的驾培企业，也是全国教练车台数最多、连锁运营规模最大的驾培企业。",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493720053378&di=cddfc7c56a15107bf59ab5473fa3a431&imgtype=0&src=http%3A%2F%2Fimg13.360buyimg.com%2Ftuangou%2F" +
                        "g1%2FM00%2F06%2F13%2FrBEGD1AXefAIAAAAAADDyBCpxF4AABShwHQs6wAAMPg862.jpg"));
        addItem(new DummyItem(String.valueOf(5), "龙泉驾校 - 5000¥", "　 北京龙泉机动车驾驶员培训中心成立于1992年，同年正式招收培训学员。至今，北京龙泉机动车驾驶员培训中心已成为京城资历最老，规模最大，师资最强，学员最多的旗舰型驾驶员培训学校之一。此外，北京龙泉机动车驾驶员培训中心以其独一无二的花园式训练场和距京城市中心最近的地理优势独享天时地利。龙泉驾校在北京市保护消费者权益调查驾驶行业中被学员评为实际消费首选品牌、心目中理想品牌。" +
                "被市交管局评为先进驾校，“北京青年报”评为明星驾校，“北京工人报”评为十佳驾校。",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493720081953&di=f4dc3785b823345257b77f0f149cf22e&imgtype=jpg&src=http%3A%2F%2Fimg1" +
                        ".imgtn.bdimg.com%2Fit%2Fu%3D2288485307%2C1831655480%26fm%3D214%26gp%3D0.jpg"));
        addItem(new DummyItem(String.valueOf(6), "蓝天驾校 - 5000¥", "河北蓝天机动车驾驶员培训学校,位于河北省石家庄市坤桥街8号西二环与北二环交汇处西二环路西（景秀路），是一家提供驾驶培训相关服务的企业。创建于1992年 ，被授予《全国百强驾校》《全国十佳诚信" +
                "办学单位》荣誉称号。", "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493720109818&di=1db83a5a1e2f9b455486a51eb63b849a&imgtype" +
                "=0&src=http%3A%2F%2Fupload.tielingcn.com%2F2016%2F0902%2F1472794892579.jpg"));
        addItem(new DummyItem(String.valueOf(7), "丰顺驾校 - 5000¥",
                "三环路旁，丽泽桥畔，绿树成荫，百花争艳。一座花园式的训练场就在您的身边！北京丰顺机动车驾驶员培训中心，是集法培、桩、路训练、考试为一体的培训场所。中心占地面积10万余平方米，理论培训教室，多媒体教学设备一应俱全，可供800人同时进行交通法规的学习。全封闭灯光训练场，模拟实际道路，教学设施完善，可容纳150部教练车进行道路驾驶和穿桩训练。作为全市唯一的夜间训练场，更为“上班族”提供了学车的便利条件。培训中心坚持“科学管理、求实诚信、服务社会、创新争先”的经营理念。十余年来，曾荣获“星级驾校”、“花园式训练场”等多项荣誉称号，并通过了ISO9001质量管理体系和ISO14001环境管理体系认证。优美的环境、规范的教学，训练有素的教练员队伍，使丰顺" +
                        "已成为培养优秀驾驶员的摇篮。一帆风顺的车旅 从丰顺驾校开始！丰顺期待您的到来！",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493720181579&di=e3db975d70aaf3170ce57a4f3b11e78f&imgtype=0&src=http%3A%2F%2Fwww.m" +
                        "zsky.cc%2Fdata%2Fattachment%2Falbum%2F201512%2F07%2F142438p120n1twqi3wqrcq.jpg"));
        addItem(new DummyItem(String.valueOf(8), "通略驾校 - 5000¥", "通略驾校自创建以来，已经走过十多年的成长历程，至今已发展成为：拥有近500名教职员工和600辆教练车的专业机动车驾驶员培训机构。我们配备先进的“交通法规”培训电子教室和考试设备，而且车型齐全，带教老师大多具有丰富的带教经验。通略驾校本着“以学员为中心，使学员称心，让学员放心”的“三心”经营理念，我们的服务口号是：“学员对美好学车品质的向往，就是我们奋斗目标。”倡导“诚信为本，服务至上，规范管理”的企业精神，提高培训质量。通略驾校的突出规模效应，可以让利学员。我们将社会效益作为己任，以优质的管理和服务打造企业品牌，争创行业中的一流" +
                "企业，将“您学车，我服务”扎根于每位教职员工的心中。",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493720239646&di=c6407a348b1a541f03936716f329614d&imgtype=0&src=http%3A%2F%2Fwww.tlj" +
                        "x.sh.cn%2Fuploads%2Fallimg%2F150417%2F1-15041G40AOS.jpg"));
        addItem(new DummyItem(String.valueOf(9), "远大驾校 - 5000¥", " 远大驾校报名中心隶属于北京柏沃兴科技有限公司，注册成立于1984年，是当时京城屈指可数的几家驾校之一。建校20多年来已培养了数十万名合格的汽车驾驶员，其中，许多人已成为党政机关领导干部、著名企业家、社会知名人士。尤其是我国航天员、公安民警和在校大学生都" +
                "把远大驾校报名中心作为他们学车的首选。 \n ",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493720298994&di=6abf7aa3df1d42c422a25830a8494f6b&img" +
                        "type=0&src=http%3A%2F%2Fs14.sinaimg.cn%2Fmw690%2F0020Fw6nzy6QNvGnZ7ffd%26690"));
        addItem(new DummyItem(String.valueOf(10), "天保驾校 - 5000¥", "南京天保桥驾驶员培训学校（简称天保驾校）创建于1990年，总校在城南天保桥训练基地，天保驾校有着十多年的办学历史和经验，是南京驾校中培训规模最大、通过率最高的驾校之一，天保的培训质量始终居同行业领先水平，年培训规模达2万余人，受到了学员的一致认可，并第一个向社会郑重承诺：“学员领取驾照后能" +
                "在新街口、鼓楼、山西路等市区繁华地段独立安全驾驶!”... ",
                "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1493720342731&di=6dc685e08d9dee117f00f21cbbee365a&imgtype=0&src=http%3A%2F%2Fwww.njcgs.com%2FUploadFiles%2F201122394255136.jpg"));
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
