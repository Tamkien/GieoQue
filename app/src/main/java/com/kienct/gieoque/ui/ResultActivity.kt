package com.kienct.gieoque.ui

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.kienct.gieoque.R
import com.kienct.gieoque.entities.Hexagram

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val hexagrams = addHexes()
        val hexID = intent.getStringExtra("hexID")
        val tvSolarDate = findViewById<TextView>(R.id.txtSolarCalendar)
        tvSolarDate.text = intent.getStringExtra("solarCal")
        val tvLunarDate = findViewById<TextView>(R.id.txtLunarCalendar)
        tvLunarDate.text = intent.getStringExtra("lunarCal")
        val ivHexImage = findViewById<ImageView>(R.id.ivHexImage)
        val tvHexName = findViewById<TextView>(R.id.txtHexName)
        val tvHexDescription = findViewById<TextView>(R.id.txtHexDescription)
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener { finish() }
        for (hex in hexagrams) {
            if (hexID == hex.id) {
                ivHexImage.setImageResource(hex.imgSrc)
                tvHexName.text = hex.name
                tvHexDescription.text = hex.description
            }
        }
    }

    private fun addHexes(): MutableList<Hexagram> {
        val hexagrams: MutableList<Hexagram> = ArrayList()
        hexagrams.add(Hexagram("000000", "QUẺ THUẦN CÀN", R.drawable.i01, "\"Khốn Long Đắc Thủy\" – Thời vận đã đến.\n" +
                "\"Càn\" tượng trưng \"Trời\", mặt đối lập với \"Đất\".\n" +
                "\"Quẻ Càn\" là quẻ mở đầu mang ý nghĩa \"Khốn Long Đắc Thủy\" tức \"Rồng bị cùng khốn đang thiếu nước\", ví như đại hạn gặp mưa rào, không gì tốt bằng.\n" +
                "\"Càn\" cũng có nghĩa khác là \"cứng rắn, khỏe mạnh\".\n" +
                "Cái gọi là \"cứng rắn, khỏe mạnh\", không quanh co, giữ thái độ công bằng chính trực, vì thế được coi là biểu tượng của rồng bị khốn khó lấy được nước. Rồng khốn được nước chỉ con rồng sống một thời gian dài trong vực, không được bay nhảy bỗng trời mưa to, sấm chớp ầm ầm. Nhờ có mưa mà nó có thể mặc sức bay nhảy.\n" +
                "* Hình tượng quẻ nói rằng: Giao long (rồng nước) ở trong vực đã lâu, nay gặp cơn mưa liền bay lên trời. Rồng bay lượn trên trời ví như sự biến hóa, dù gặp tai họa cũng không bị hại, thỏa chí vẫy vùng, không còn gì hơn.\n" +
                "Nếu gieo được quẻ này, đó là điềm \"Thời vận đã đến\", gặp thời đắc thế, thỏa chí vẫy vùng, không sợ họa hung.\n" +
                "* Lời đoán giải: Quẻ Càn là quẻ Đại cát, đặc biệt vui sướng. Người xem thấy quẻ này rất mừng, mọi việc như ý, không sợ họa hung.\n" +
                "Lời của quẻ Càn chỉ có 4 chữ: \"Nguyên, Hanh, Lợi, Trinh\". \"Nguyên\" là cái đầu tiên, sự mở đầu, cái căn bản; \"Hanh\" là thông suốt; \"Lợi\" là thuận lợi; \"Trinh\" là chung thủy, không thay đổi. Nhưng 4 tính chất này ở đây thuộc đối tượng thiên thời, dùng để giải thích một quy luật tự nhiên: 4 mùa thay đổi. \"Nguyên\" chỉ mùa xuân vạn vật bắt đầu sinh sôi, nảy nở. \"Hanh\" chỉ mùa hạ vạn vật trưởng thành phát triển phù hợp với quy luật. \"Lợi\" chỉ mùa thu đã kết quả. \"Trinh\" chỉ mùa đông muôn vật đã thành. Người xưa cho rằng, sự vật hiện tượng phát triển đúng quy luật phải đạt được 4 điều: Nguyên, Hạnh, Lợi, Trinh. Quẻ Càn tượng trưng cho người quân tử có 4 đức tính: \"Nhân, Nghĩa, Lễ, Trí\".\n" +
                "Luận đoán tài vận tốt xấu theo mùa:\n" +
                "- Nếu bạn gieo được quẻ này vào mùa xuân, tài vận của bạn bắt đầu sinh sôi.\n" +
                "- Nếu bạn gieo được quẻ này vào mùa hạ, tài vận của bạn đang tiến lên.\n" +
                "- Nếu bạn gieo được quẻ này vào mùa thu, càng phải chúc mừng bạn, vì bạn có thu hoạch khá lớn.\n" +
                "- Nếu bạn gieo được quẻ này vào mùa đông, tài vận không tốt bằng 3 mùa trước.\n" +
                "Ngoài ra, bạn có thể chia một ngày thành 4 phần. Trước 12 giờ trưa, đại diện cho mùa xuân, mùa hạ. Sau 12 giờ trưa, đại diện cho mùa thu, mùa đông. Nếu trước 12 giờ trưa, bạn gieo được quẻ Càn, tài vận của bạn đang bắt đầu hoặc đang phát triển. Nếu sau 12 giờ trưa bạn gieo được quẻ Càn, tài vận của bạn đã ngừng phát triển."))
        hexagrams.add(Hexagram("111111", "QUẺ THUẦN KHÔN", R.drawable.i02, "\"Hổ Ngã Đắc Thực\" (Ngã: đói; Thực: thức ăn, mồi) – Toại lòng mãn ý.\n" +
                "\"Khôn\" tượng trưng \"Đất\", mặt đối lập của \"Trời\", mang tính nhu thuận, tính mềm mỏng, yếu ớt, vì thế được coi là hình tượng của hổ đói được ăn. \"Hổ đói được ăn\" là chuyện một con hổ bị đói lâu ngày, đang đi tìm mồi, bất ngờ gặp một con dê lạc đàn ngay trước mặt, lập tức vồ ăn ngay. Nếu gieo được quẻ này, đó là điềm \"Toại lòng mãn ý\".\n" +
                "* Hình tượng quẻ nói rằng: Dê béo lạc đàn vào núi, hổ vồ được ăn ngấu ăn nghiến. Sau khi ăn no nê, hổ rất thỏa mãn.\n" +
                "* Lời đoán: Gieo được quẻ này, toại lòng mãn ý. Tìm người thấy người, mất của tìm được, bệnh tật khỏi dần, mọi việc như ý.\n" +
                "Lời giải: Toại lòng mãn ý.\n" +
                "Khôn là quẻ thứ hai trong 64 quẻ. Khôn chỉ đất, mặt trăng. Quẻ Càn gọi là quẻ thuần Dương, quẻ Khôn gọi là quẻ thuần Âm. Tính chất của \"Khôn\" là đất đai nhu thuận, nuôi dưỡng vạn vật.\n" +
                "Lời giải nghĩa đáng chú ý của quẻ Khôn là \"Tiên mê, hậu đắc\" tức ban đầu, giai đoạn đầu u mê, mất hướng, giai đoạn sau tỉnh ngộ được lợi. Vì vậy, tất cả những người gieo được quẻ Khôn đều có hiện tượng giai đoạn đầu của sự việc u mê, lú lẫn giai đoạn sau tỉnh táo, thành công hoặc \"trước khó sau dễ\", \"trước khổ, sau sướng\".\n" +
                "Nếu bốc được quẻ Khôn phải nhu thuận, không nên cưỡng chế, \"dùng tĩnh thì đắc, dùng động thì tiêu\".\n" +
                "Luận đoán tài vận:\n" +
                "Không thể sử dụng phương châm \"chủ động tấn công\".\n" +
                "Căn cứ vào quẻ này có thể đoán tài vận của bạn như sau: Giai đoạn đầu không tốt, giai đoạn sau tốt.\n" +
                "Quẻ Khôn nhắc nhở bạn một điều: Bạn phải dùng thế \"thủ\", không thể \"chủ động tấn công\". Nếu \"chủ động tấn công\" sẽ càng làm sự việc xấu đi. Không ngại khó khăn trục trặc, cuối cùng bạn vẫn giành thắng lợi."))
        hexagrams.add(Hexagram("101110", "QUẺ THỦY LÔI TRUÂN", R.drawable.i03, "\"Loạn Ty Vô Đầu\" – Lòng dạ rối bời. (\"Ty\": là tơ; \"Đầu\": đầu dây tơ).\n" +
                "\"Truân\" có nghĩa là \"đầy\", đầy đủ điều kiện, muôn vật mới sinh. Mới sinh thì còn phải gian truân, chưa làm được gì, mọi sự mới bắt đầu, mọi việc chồng chất. Vì thế, quẻ này mới có hình tượng \"tơ rối lung tung, không tìm được đầu dây để gỡ\".\n" +
                "\"Loạn ty vô đầu\" là chuyện tơ rơi ngoài nhà, bỗng nhiên cuồng phong thổi tới làm tơ rối lung tung, đảo đi đảo lại, tìm không ra đầu. Người gieo phải quẻ này là điềm chủ nhân \"Lòng dạ rối bời\". Quẻ này còn có ý chỉ thời buổi rối ren, lòng người nháo nhác, tâm trạng rối bời.\n" +
                "* Hình tượng của quẻ Truân: Gió thổi làm tơ rối lung tung, gỡ không ra vì tìm không thấy đầu dây tơ. Nếu gặp việc vặt vãnh tạm thời chưa làm, mọi việc làm từ từ chậm rãi mới thuận lợi. Cầu danh, cầu tài đều không được.\n" +
                "* Lời đoán: Bệnh tật khó chữa khỏi, hôn nhân không hay, cãi nhau chuyện vặt, mọi việc rối mù. Đúng là \"Loạn ty vô đầu\", thật là \"Lòng dạ rối bời\".\n" +
                "Lời bàn: \"Truân\" là hiện tượng mới sinh ra, biểu hiện chưa rõ ràng. Đây là quẻ nói về thời kỳ đầu của mọi hiện tượng, \"tình\" chưa rõ, \"thế\" chưa định vì vậy cần phải thận trọng, chớ hành động vội vàng. Nếu không chỉ làm cho sự việc rắc rối thêm. Vì vậy, người khôn hiểu được vạn sự khởi đầu nan, không vội hành động.\n" +
                "Lời giải: Lòng dạ rối bời, khó khăn chồng chất.\n" +
                "\"Truân\" có nghĩa là \"ứ đọng\". Người cổ đại hành quân tác chiến, thường đóng quân ở một vùng nào đó, trước tiên trồng trọt, chuẩn bị lương thực, vật tư đầy đủ nhưng vẫn chưa tấn công. Nguyên tắc của tượng quẻ Truân là phòng thủ.\n" +
                "\"Kinh Dịch\" nói: \"Truân giả, nan dã\" tức \"quẻ Truân, khó thay\". Ý chỉ vạn sự khởi đầu nan. Kinh Dịch dùng cụm từ \"Vân Lôi Truân\" có ý nói: Trên trời mây đen đầy trời, sấm chớp đùng đùng như sắp mưa to. Người đi đường vội tìm chỗ trú nhưng trời không mưa, thật là vất vả (truân chuyên).\n" +
                "Quẻ này nhắc nhở bạn chớ có \"mạo hiểm tấn công\" tốt nhất là né tránh, đợi khó khăn nguy hiểm qua đi rồi mới tính.\n" +
                "Luận đoán tài vận:\n" +
                "Chỉ có thể cố thủ, chớ manh động đầu tư, mở rộng sản xuất, buôn bán. Hơn nữa, bạn phải cảnh giác đề phòng những tình huống xấu sắp xảy ra."))
        hexagrams.add(Hexagram("011101", "QUẺ SƠN THỦY MÔNG", R.drawable.i04, "\"Tiểu quỷ thâu tiền\" – \"Thời vận không hay\".\n" +
                "\"Mông\" có nghĩa là sự mờ tối sắp được khai sáng.\n" +
                "\"Mông\" chỉ sự mông muội, tối tăm, vì thế được coi là hình tượng trẻ con ăn trộm tiền (tiểu quỷ: trẻ xấu, trẻ con nghịch ngợm).\n" +
                "\"Tiểu quỷ thâu tiền\" (thâu: ăn trộm) là chuyện một kẻ gặp thời vận không hay lại không có tiền. Khi gặp dịp, bất luận nhiều hay ít, kẻ đó không kìm được mình, giống như trẻ con ăn trộm tiền vậy. Gieo phải quẻ này là điềm \"thời vận không hay\" (thời vận bất tường).\n" +
                "* Hình tượng của quẻ Mông: Biểu hiện của các hào trong quẻ phạm sao Tiểu Hao, quân tử gieo phải quẻ này, thời vận không hay. Việc hôn nhân, việc góp vốn kinh doanh không thành. Mọi việc gian lao vất vả, phí công vô ích.\n" +
                "* Lời đoán: Là người chuộng nghĩa khinh tài, kiếm tiền dễ dàng, học đến nơi đến chốn, nhưng bị ma quỷ lấy trộm hết.\n" +
                "* Lời bàn: Của bất nghĩa dù giữ thế nào cũng không được, tất có ngày bị \"tiểu quỷ thâu tiền\". Trẻ con ăn trộm tiền là do trí tuệ còn mờ, lòng dạ còn tối, còn kẻ tích của bất nghĩa lòng dạ mới thực sự là mờ tối, vì không còn cơ hội được khai sáng nữa.\n" +
                "Lời giải: Thời vận không hay, lầm đường lạc lối.\n" +
                "\"Mông\" có nghĩa là non nớt, mờ tối. Mờ tối thì sinh ra hồ đồ, không phân biệt đúng sai, coi cái đúng cũng như cái sai. Kinh Dịch dùng câu \"Sơn hạ xuất tuyền\" (dưới núi có suối chảy) để chỉ tượng của quẻ Mông. Dòng suối từ núi cao chảy xuống, tung tóe khắp nơi. Đó là biểu hiện của sự mông muội, mất phương hướng của quẻ Mông. Vì vậy, Kinh Dịch dùng quẻ Mông để nhắc chúng ta \"Quân tử dĩ quả hành dục đức\". \"Quả hành\" tức làm việc có mục đích rõ ràng, có phương châm cụ thể, \"dục đức\" tức bồi dưỡng đạo đức. Nếu xác định sai mục tiêu, sai đối tượng cũng chỉ tình trạng tâm lý lú lẫn, hồ đồ do trí mờ dạ tối.\n" +
                "Luận đoán tài vận:\n" +
                "Tài vận không hay. Nguyên nhân chủ yếu là bạn đang lạc lối, chưa tìm thấy đường ra. Thực tế, bạn càng đầu tư, mở rộng sản xuất buôn bán thì càng khó khăn. Nếu bạn gieo phải quẻ này tức phạm sao Tiểu Hao, góp vốn kinh doanh hao hụt, thật uổng công phí sức.\n" +
                "Bạn có thể kiếm tiền dễ dàng, nhưng số tiền này không dùng vào việc có ích, trái lại bị hao hụt không đâu vào đâu, cuối cùng thu không bù nổi chi. Thời xưa, mỗi tháng có thể xem một quẻ, vì vậy nếu gặp quẻ xấu bạn cũng không phải quá buồn phiền"))
        hexagrams.add(Hexagram("101000", "QUẺ THỦY THIÊN NHU", R.drawable.i05, "\"Minh Châu Xuất Thổ\" – Vận tốt đã đến. (Minh Châu: Ngọc sáng).\n" +
                "\"Nhu\" có nghĩa là \"cần đến\", được thời mà hành động. Vì vậy, nó có hình tượng ngọc sáng ra khỏi lòng đất.\n" +
                "\"Minh châu xuất thổ\" là chuyện ngọc sáng vùi lấp trong đất lâu ngày, chưa hề bị phát hiện, nay bỗng nhiên đất đá bị gió xối, nước cuốn, ngọc sáng lộ thiên. Ngọc sáng ai nhìn cũng thích.\n" +
                "Nếu gieo được quẻ này là điềm \"Vận tốt đã đến\" (thời vận làm ăn thuận lợi, thành công).\n" +
                "* Hình tượng của quẻ Nhu nói: Ngọc sáng bị vùi trong đất lâu ngày không lộ ra vẻ lung linh, cho đến một hôm bỗng nhiên gió thổi hoặc nước cuốn, đất đá bay đi, ngọc sáng long lanh xuất hiện.\n" +
                "* Lời đoán: Mưu việc tất thành, hôn nhân hòa hợp, cầu tài như ý, ước nguyện thỏa mãn.\n" +
                "* Lời bàn: \"Nhu\" còn có nghĩa là \"chờ\", là \"đợi\" điều kiện thuận lợi. Chớ manh động mà rơi vào hoàn cảnh khó khăn, nguy hiểm. Người khôn phải biết chờ thời đợi thế, xử sự rộng lượng, không hành động quá mức, có lợi có ích thì tiến, bất lợi vô ích thì lui, được thời thì ra làm quan, mất thế thì lui về ở ẩn.\n" +
                "Lời giải: Vận tốt sắp đến, vì \"minh châu xuất thổ\".\n" +
                "\"Nhu\" chỉ nhu cầu, cần nuôi dưỡng, điều kiện mà sự vật, hiện tượng cần phải có. Tượng của quẻ này: Mây ở trên quá cao, vì vậy phải nhẫn nại chờ đợi. Hiện tượng này là cảnh oi bức trước khi trời làm mưa. Nghĩa của quẻ Nhu là đợi, vì phía trước nguy hiểm, nếu tiến sẽ bất lợi. Vì vậy, gieo được quẻ này, bạn phải tích lũy lực lượng, chuẩn bị đầy đủ để khi thời cơ đến có thể hành động được ngay. Chờ đợi không có nghĩa là không làm gì. Gặp việc phải xét có nên hay không nên làm không, có lợi thì tiến, bất lợi thì dừng.\n" +
                "Đây cũng là quẻ tốt, chỉ vận tốt đã đến, nhưng có kèm theo điều kiện thiên thời. Thời cơ trong kinh doanh có thể theo mùa, theo tháng, theo năm. Gieo được quẻ này bạn như được nhắc nhở: Phải biết chờ đợi. Bạn là người trong cuộc sẽ tự biết phải chờ điều gì. Thí dụ, chờ chính sách mới, chờ giá nguyên liệu xuống, chờ nhu cầu thị trường…\n" +
                "Luận đoán tài vận:\n" +
                "Nếu nhẫn nại chờ đợi, tài vận hanh thông. Bạn giống như con báo đang săn mồi. Báo săn mồi không phải chỉ dựa vào tốc độ chạy nhanh mà còn ở chỗ biết chờ con mồi đến gần."))
        hexagrams.add(Hexagram("000101", "QUẺ THIÊN THỦY TỤNG", R.drawable.i06, "\"Nhị Nhân tranh lộ\" – Việc làm không thuận. (Lộ: đường)\n" +
                "\"Tụng\" có nghĩa là tranh cãi trong tòa để giành thắng kiện, vì thế có hình tượng hai người tranh đường.\n" +
                "\"Hai người tranh đường\" là chuyện trên con đường nhỏ thậm chí rất hẹp, hai kẻ đi ngược chiều, ai cũng muốn tranh đi trước, không chịu nhường đường. Gieo phải quẻ này là điềm \"Việc làm không thuận\".\n" +
                "* Hình tượng của quẻ Tụng nói: Việc dự định thực khó làm, lại là hai kẻ tranh đường, đều không chịu nhường nhịn, không muốn kẻ khác hơn mình.\n" +
                "* Lời bàn: Tranh đường là hành động của động vật, tranh cãi là việc nên tránh. Kiện tụng để phân đúng sai. Theo kiện là việc hung. Thắng kiện là mầm tai họa. Vì vậy, người khôn ngoan vạn bất đắc dĩ mới kiện tụng, chi bằng làm cho kẻ đối địch tâm phục khẩu phục. Ở đời không ai lại tranh khôn với \"động vật\", không ai nhờ người khác xử cho mình thắng kiện \"động vật\".\n" +
                "Lời giải: Việc làm không thuận vì \"nhị nhân tranh lộ\".\n" +
                "\"Tụng\" có nghĩa là kiện tụng, tranh luận trong tòa để thắng kiện. Kinh Dịch có câu: \"Tụng giả, luận dã\" tức kiện tụng, chính là cãi lý vậy. Trong tòa án tranh luận chủ yếu là phải vạch ra cái sai của đối phương nếu không cứ khăng khăng cho mình là đúng thì cũng vô ích. Quẻ này nhắc chúng ta \"quân tử mưu sự từ khi sự việc chưa xảy ra\" tức đề phòng tranh chấp kiện tụng. Một trong những phương thức để tránh và hóa giải tranh chấp kiện tụng là \"nhượng bộ\". Nhượng bộ có nguyên tắc là nhượng bộ để kéo dài thời gian, nhượng bộ để tồn tại, nhượng bộ để làm giảm thế hùng hổ của địch, nhượng bộ để tránh làm tan vỡ mối quan hệ răng mội… Người thông thái nếu vướng phải kiện tụng cũng giữ thái độ vừa phải, nếu biết bao dung thì càng tốt, bởi xử sự theo đuổi vụ kiện đến cùng là hung, thắng kiện là mầm tai họa. Vả lại, ở đời không ai tranh khôn với \"kẻ ngu\", không ai nhờ luật sư cãi cho mình thắng kiện \"người điên\", vì có \"điên\" mới đi kiện.\n" +
                "Luận đoán tài vận: Phải biết nhượng bộ.\n" +
                "Vận tài lộc của bạn đang gặp khó khăn. Nguy cơ tranh chấp, tranh cãi, kiện tụng đang đợi bạn. Tục ngữ nói: \"Hòa khí sinh tài\". Tranh cãi kiện tụng không những hao tài tốn của mà còn mất thời gian hao sức lực. Muốn tránh tranh chấp, phải biết nhượng bộ."))
        hexagrams.add(Hexagram("111101", "QUẺ ĐỊA THỦY SƯ", R.drawable.i07, "\"Mã Đáo Thành Công\" – Mọi sự tốt đẹp. (\"Mã đáo\": Ngựa vừa đến)\n" +
                "\"Sư\" có nghĩa là \"quần chúng\", vô địch, không thể đánh bại được. Vì vậy, nó có hình tượng \"lập tức thành công\".\n" +
                "\"Mã đáo thành công\" là chuyện một vị tướng phụng mệnh thảo phạt giặc cỏ, lên ngựa xông vào trại giặc, lập tức thành công. Ý chỉ khi ngựa vừa đến đã thành công ngay, sự việc mới bắt tay làm đã thành công ngay.\n" +
                "Gieo được quẻ này là điềm \"Mọi sự tốt đẹp\".\n" +
                "* Hình tượng của quẻ Sư:\n" +
                "Tướng nhận chỉ của vua xuất chinh, cưỡi ngựa khỏe, kéo cung cứng, bách bộ xuyên dương, bắn rơi đồng tiền, quân lính reo hò phấn khởi.\n" +
                "Lời đoán: Bệnh tật khỏi hẳn, của mất lại về, đi xa có tin, mọi việc suôn sẻ.\n" +
                "Lời bàn: Khi điều kiện đầy đủ, lại thuận lợi thì thành công ngay. \"Mã đáo thành công\", điều này chứng tỏ thời cơ đã chín muồi, mọi điều kiện đã đầy đủ, chỉ cần bỏ ra ít công sức là thành công ngay. Thành công nhất thiết là may mắn. Nó là kết quả công sức của nhiều người, nhiều thế hệ, nhiều nhân tố mà bạn chỉ là người gặt hái mà thôi.\n" +
                "Lời giải: Thành công dễ dàng.\n" +
                "\"Sư\" có nghĩa là huy động quân đội đánh trận. Quẻ Sư là quẻ phát động chiến tranh. Kinh Dịch nói về quẻ này là \"Địa trung hữu thủy\" tức dòng nước chảy trên đất, khí thế mạnh mẽ. Nước hiền hòa có thể tưới mát ruộng đồng, nhưng nước nhiều phá đê gây lụt lội. Ở đây không nói về cái hại của nước lũ mà mượn hình tượng của dòng nước lũ để nhắc chúng ta biết huy động sức lực của nhiều người, huy động tiền vốn, kỹ thuật của nhiều đối tác mới thành công. Nhưng điều khiển quân đông không có kỷ luật, đội quân hỗn loạn; quản lý con người, tiền vốn không chặt chẽ sẽ hao hụt thua lỗ. Trong quân có kẻ lười nhác, không nghe mệnh lệnh; trong công ty có kẻ trốn việc, chểnh mảng, làm lấy lệ tất hung.\n" +
                "Luận đoán tài vận:\n" +
                "Vận tài lộc của bạn phụ thuộc bạn có biết phát huy sở trường của mọi người hay không? Vần đề ở chỗ, một mình bạn xoay xở kinh doanh hay hợp tác với mọi người cùng kinh. Quẻ này thích hợp với người biết hợp tác kinh doanh với những người cùng chí hướng, không thích hợp với người làm ăn đơn độc. Thương trường như chiến trường, vì vậy hãy tìm các bạn cùng ngành, cùng chí hướng, đủ tin cậy để hợp tác."))
        hexagrams.add(Hexagram("101111", "QUẺ THỦY ĐỊA TỴ", R.drawable.i08, "\"Thuyền đắc thuận phong\" – Việc gì cũng lợi.\n" +
                "\"Tỵ\" có nghĩa là \"giúp nhau\", vì vậy có hình tượng thuyền xuôi gió.\n" +
                "\"Thuyền đắc thuận phong\" là chuyện thuyền chở đường ăn rất nặng, nước chảy ngược chiều, thuyền đi không nổi, bỗng nổi cơn gió thuận, thuyền căng buồm đi, chẳng tốn sức chèo.\n" +
                "Người gieo được quẻ này là điềm \"Việc gì cũng lợi\".\n" +
                "* Hình tượng của quẻ Tỵ: Thuyền nặng giương buồm, theo chiều gió thổi nhẹ, bỗng ông trời cho một trận gió, chẳng phải chèo, thuyền đi vun vút.\n" +
                "* Lời đoán: Mất của tìm thấy, việc công có lý, hôn nhân tốt đẹp, cầu danh thuận lợi, mọi việc vui vẻ.\n" +
                "* Lời bàn: Thuyền nặng được gió đẩy, chạy băng băng. Việc khó được người giúp mới thành công. Không ai có thể làm một mình, không cần người giúp mà làm được những việc lớn. Được người giúp tức là được trời giúp. Muốn được người giúp, phải giúp người trước, bởi vì mình muốn được người giúp trước, còn người chưa có nhu cầu mình giúp.\n" +
                "Lời giải: Việc gì cũng lợi.\n" +
                "\"Tỵ\" có nghĩa là kề nhau, giúp nhau. Kinh Dịch giải thích: \"Tỵ\" có nghĩa là thân tình hòa hợp. Kinh Dịch dùng cụm từ \"Địa thượng hữu thủy\" để nói rõ quẻ Tỵ. \"Tỵ, tiên vương dĩ thân chư hầu, kiến vạn quốc\", có nghĩa là xưa quân vương thông minh nhất phải dựa vào quẻ này để thân chư hầu, cai trị thiên hạ. Đối với chư hầu, quan lại cũng phải thân cận với vua chúa để thăng quan tiến chức. Vì vậy, tiểu nhân muốn thăng quan tiến chức bằng con đường luồn cúi. Không ai có thể đứng một mình mà tồn tại, ngay cả vua cũng dựa vào quan để tồn tại.\n" +
                "Luận đoán tài vận:\n" +
                "Tài vận của bạn rất thuận lợi, như ý. Cơ hội phát tài của bạn rộng mở. Tuy nhiên, trong khi kinh doanh buôn bán, bạn phải biết thân mật hòa hợp với những quan chức quản lý kinh tế, đề phòng có những kẻ xấu ngăn cản, phá hoại công việc kinh doanh của bạn. Bạn không nên tiếc tiền chi cho công việc \"ngoại giao\". Cổ ngữ có câu \"Hòa khí sinh tài\", nếu biết giữ mối hòa khí đối với mọi người, đối với quan chức chính quyền thì bạn sẽ giàu có."))
        hexagrams.add(Hexagram("001000", "QUẺ PHONG THIÊN TIỂU SÚC", R.drawable.i09, "\"Mật Vân Bất Vũ\" – Tạm thời phải nhẫn. (Mật vân: mây dày đặc)\n" +
                "\"Tiểu súc\" có nghĩa là \"khí âm phát, thịnh vượng, khí dương bị tù hãm, chứa chất, chưa bộc lộ\", có khí mà không có chất, vì vậy mới có hình tượng mây dày đặc mà không mưa.\n" +
                "\"Mật Vân Bất Vũ\" là chuyện trời hạn đã lâu, cỏ cây khô héo, mọi người đều mong mưa. Ai ngờ mây kéo kín trời nhưng lại không mưa.\n" +
                "Gieo phải quẻ này là điềm \"Tạm thời phải nhẫn\".\n" +
                "* Hình tượng của quẻ nói rằng:\n" +
                "Cây trồng bị hạn lâu ngày, lá đã vàng úa, ai ngờ mây đen kéo đến nhưng lại không mưa. Nông dân ngửa mặt lên trời than thở vì sao lại như vậy?\n" +
                "Ngày xưa, Dương Kế Nghiệp bị vây ở Lang Nha Lĩnh gieo phải quẻ này. Quả nhiên, Dương Thất Lang đi cầu viện binh, Phan Nhân Mỹ không hề cho quân đi cứu. Đúng là ứng với quẻ \"Mật vân bất vũ\", thật là \"tạm thời phải nhẫn\".\n" +
                "* Lời thơ của quẻ Tiểu Súc:\n" +
                "Mây dày giăng khắp lại không mưa,\n" +
                "Chờ đợi người đi, chẳng thấy về.\n" +
                "Giao dịch xuất hành, đều không tốt,\n" +
                "Hôn nhân, cầu lợi chỉ uổng công.\n" +
                "* Lời đoán: Khí hậu bình bình, tạm thời ung dung; cãi cọ và bệnh tật khiến lòng lo âu.\n" +
                "* Lời bàn:\n" +
                "Mây là khí của âm dương, hai khí này hòa hợp mới thành mưa. Hai khí này mâu thuẫn nhau không thể mưa được. Trong trường hợp này, con người phải tạm thời chịu đựng, chờ đợi khí âm và khí dương giao hòa. Thường là khí âm phải thuận theo khí dương. Khí âm đang thịnh thì hành động không thành.\n" +
                "Lời giải: Tạm thời phải nhẫn.\n" +
                "\"Súc\" có nghĩa là \"tích trữ\". \"Tiểu Súc\" có nghĩa là \"tích trữ còn ít\", tức lượng chưa đủ. Quẻ này miêu tả hiện tượng hạn hán. Hạn hán không đột ngột xảy ra như lũ lụt, mà diễn ra trong một thời gian rất dài. Đã lâu không mưa, có lẽ trời sẽ mưa trong một vài ngày tới. Lời của quẻ \"Mật vân bất vũ tự ngã Tây giao\" xuất phát từ điển tích \"Tự ngã Tây giao\": Ngày xưa vua Trụ tàn bạo, dân chúng ngày đêm mong chờ Chu Văn Vương nhanh chóng tấn công giải phóng cho họ thoát khỏi bể khổ. Nhưng Chu Văn Vương thấy thời cơ chưa chín muồi nên không phát binh. Dân đợi Văn Vương như hạn hán mong mưa. Chu Văn Vương như mây kéo đầy trời nhưng không mưa. Dân chúng đành phải chạy về phía Tây theo Chu Văn Vương.\n" +
                "Luận đoán tài vận:\n" +
                "Tình trạng tài chính của bạn đang bị \"hạn hán\" rất cần một đợt \"mưa to\". Đứng trước tình hình bất lợi này, bạn phải hết sức kiên nhẫn. Cổ nhân nói rất hay: \"Đại phú do trời, tiểu phú do kiệm\". Trước tiên phải \"thắt lưng buộc bụng\" để duy trì hoạt động kinh doanh, đồng thời tích cực đi tìm nguồn vốn mới."))
        hexagrams.add(Hexagram("000100", "QUẺ THIÊN TRẠCH LÝ", R.drawable.i10, "\"Phượng Minh Kỳ Sơn\" – Quốc gia cát tường.\n" +
                "\"Lý\" có nghĩa là \"đi rón rén\", \"rón rén mà không tiến\", vì vậy nó có hình tượng của chim phượng hoàng kêu ở núi Kỳ.\n" +
                "\"Phượng kêu Kỳ sơn\" là chuyện phượng hoàng, loài chim đại diện cho sự cát tường, rất ít khi nhìn thấy. May bỗng nhiên phượng hoàng kêu ở Kỳ Sơn, sau đó Chu Văn Vương được gọi là \"Thánh Đức\" dựng nhà Tây Chu. Nếu gieo được quẻ này chính là điềm \"Quốc gia cát tường\".\n" +
                "* Hình tượng của quẻ nói rằng: Phượng hoàng đậu ở Kỳ Sơn, kêu 3 tiếng, đất nước xuất hiện thánh hiền. Trời cho Chu Văn Vương tạo dựng nhà Chu, vinh hoa phú quý kéo dài 800 năm.\n" +
                "Ngày xưa, Hỷ Tịnh khi lên ngôi, mơ thấy mặt trời, tỉnh dậy gieo được quẻ này. Quả nhiên, Hỷ Tịnh đến Bắc Lương, quốc thái dân an. Đúng là ứng với quẻ \"Phượng minh Kỳ sơn\", thật là \"Quốc gia cát tường\".\n" +
                "* Lời thơ của quẻ Lý:\n" +
                "Phượng kêu núi Kỳ báo cát xương,\n" +
                "Văn Vương xuất hiện, lập cơ đồ.\n" +
                "Người đi xa vằng, có tin về,\n" +
                "Kinh doanh góp vốn, đều được lợi.\n" +
                "* Lời đoán: Xuất hành có ích, cầu tài được lợi, bệnh tật tiêu tan, mưu sự tất thành.\n" +
                "* Lời bàn: Vua cuối cùng nhà Thương là Đế Tân, hiệu Trụ bỏ bê chính sự, say mê Đát Kỷ, chơi bời trác táng, dẫn tới quốc gia bị diệt vong. Hiền thần nhà Thương là Chu Văn Vương, một bậc hiền minh dùng lễ đối đãi kẻ sỹ, cho nên thiên hạ theo về nhà Chu. Sự ra đời của một thời đại mới bao giờ cũng có điềm báo.\n" +
                "Lời giải: Kinh tế chung phát triển.\n" +
                "\"Lý\" có nghĩa là \"đi rón rén\", vì vậy quẻ Lý có hình tượng Phượng hoàng bay đến đậu ở núi Kỳ Sơn kêu ba tiếng báo hiệu đất nước xuất hiện thánh hiền. \"Lý\" như dẫm lên băng mỏng, đi trên vách đá vực sâu nên trong lòng sợ sệt, cẩn thận. Mỗi một bước đi đều vô cùng cẩn thận, nếu không sẽ rớt xuống vực.\n" +
                "Kinh Dịch dùng cụm từ \"dẫm lên đuôi hổ\" làm lời quẻ. \"Con hổ\" ở đây ám chỉ hoàng đế nắm quyền sinh sát. Thời xưa, quyền lực hoàng đế rất lớn, còn sợ hơn cả hổ. Vì vậy, khi tiếp xúc với hoàng đế phải hết sức thận trọng, sợ xúc phạm đến hoàng đế mà bị họa.\n" +
                "Luận đoán tài vận:\n" +
                "Nếu gieo được quẻ Lý bạn phải luôn cẩn thận, cảnh giác, thận trọng trong từng đường đi nước bước. Những người quyết định đối với công việc làm ăn tiến tới, chí ít cũng thuận lợi, bạn phải \"chú ý chăm sóc\" đến những người này."))
        hexagrams.add(Hexagram("111000", "QUẺ ĐỊA THIÊN THÁI", R.drawable.i11, "\"Hỷ Báo Tam Nguyên\" – Đại cát đại lợi.\n" +
                "\"Thái\" có nghĩa là \"thông thái\" tức hanh thông yên ổn. Mọi sự hanh thông yên ổn, vì thế mới có hình tượng \"Hỷ báo tam nguyên\".\n" +
                "\"Hỷ báo tam nguyên\" là chuyện một người đi thi 3 vòng thi, sau đó về nhà đợi kết quả. Một hôm bỗng thấy có người đến báo tin đỗ, vô cùng vui mừng. Nếu gieo được quẻ này là điềm \"Đại cát đại lợi\".\n" +
                "* Hình tượng của quẻ nói: Học thức đầy người đi thi 3 vòng (Hương – Hội – Đình) đều đỗ, đắc ý trở về, hết mọi ưu phiền lo lắng, thật là vô cùng vui sướng.\n" +
                "Ngày xưa, Nhạc Nghị đánh Tề, Yên Vương gieo được quẻ này, trong lòng mừng rỡ. Quả nhiên, quân Yên thắng trận liên tiếp. Đúng là ứng với quẻ \"Hỷ báo tam nguyên\", thật là \"Đại cát đại lợi\".\n" +
                "* Lời thơ của quẻ Thái:\n" +
                "Hỷ báo tam nguyên, vận khí lên,\n" +
                "Mưu cầu danh lợi, đại cát hên.\n" +
                "Giao dịch, xuất hành đều có lợi,\n" +
                "Kinh doanh, góp vốn được lâu bền.\n" +
                "* Lời đoán: Hôn nhân thành công đã đi là được, của mất lại về.\n" +
                "* Lời bàn: Âm dương giao hòa thì muôn vật sinh thành, mọi sự hanh thông. Khi âm đi xuống, khi dương đi lên gọi là âm dương giao hòa. Cũng như trong một nhà, mọi người cảm thông, hòa hợp thì gia đình yên vui hạnh phúc. Theo lẽ trời đất, âm phải theo dương, vì vậy vợ phải theo chồng mới hợp với quy luật. Con người là một bộ phận của tự nhiên, vì vậy cũng phải sống, hành động theo quy luật tự nhiên, có như vậy mới có thể tồn tại lâu dài được.\n" +
                "Lời giải: Đại cát đại lợi, nhất lộ hanh thông.\n" +
                "\"Thái\" có nghĩa là \"yên ổn, hanh thông\". Ngày xưa, mỗi khi đến tết, nhà nhà đều dán câu đối tết. Trong những câu đối tết, phần lớn có 4 chữa \"Tam Dương Khang Thái\" có nghĩa là Thiên – Địa – Nhân hòa hợp yên vui.\n" +
                "Kinh Dịch dùng cụm từ \"Thiên Địa giao hòa\" để chỉ quẻ Thái. Thiên địa là âm dương, âm dương giao hòa, vạn sự thông suốt, quân tử đi lên tiểu nhân đi xuống. Nếu được quẻ này bạn có thể mạnh dạn đăng kí thi tuyển 2 đến 3 trường, khả năng thi đỗ khá cao. Quẻ này biểu tượng cho mùa xuân, vì mùa xuân, âm dương hòa hợp, vạn vật sinh thành. Từ nay, mọi việc hanh thông.\n" +
                "Luận đoán tài vận:\n" +
                "Vận tài lộc của bạn rất tốt, nhưng có thể bạn chưa cảm nhận được. Có lẽ tài vận của bạn chỉ mới bắt đầu như mùa xuân. Mùa đông vừa kết thúc, mùa xuân mới bắt đầu, việc kinh doanh mua bán hoặc đường công danh sự nghiệp mới bắt đầu tốt lên. Quẻ Thái là quẻ giao hòa, bạn phải giao lưu rộng rãi mới được mọi người giúp đỡ hợp tác mới có thể hanh thông. Tục ngữ có câu \"người chống tức là trời chống\", \"người ủng hộ tức là trời ủng hộ\", trời đã ủng hộ, nhất định thành công."))
        hexagrams.add(Hexagram("000111", "QUẺ THIÊN ĐỊA BĨ", R.drawable.i12, "\"Hổ Lạc Thâm Khanh\" – Cát ít hung nhiều.\n" +
                "\"Bĩ\" có nghĩa là \"tắc, nghẽn, không thông\".\n" +
                "\"Hổ lạc thâm khanh\" là chuyện một con hổ lớn xuống núi tìm mồi, không ngờ rơi vào hố sâu cạm bẫy của thợ săn. Hổ rơi hố sâu, mất hết uy phong. Nếu gieo phải quẻ này là điềm \"Cát ít hung nhiều\".\n" +
                "* Hình tượng của quẻ: Người đi săn đào một hầm bẫy hổ rất sâu, để dụ hổ rơi vào cạm bẫy. Nếu hổ tham mồi, rơi xuống hầm sâu, thì hung nhiều cát ít.\n" +
                "Phát hiện một khu đất rộng đẹp giá rẻ, trong thời buổi tấc đất tấc vàng, ông A quyết định chồng tiền đặt cọc mua ngay. 3 tháng sau, gia đình ông chết điếng vì biết rằng khu đất ông mua nằm trong quy hoạch phát triển giao thông mới của thành phố. Người bán cố tình che giấu nên ông đã bị lừa. Đúng là ứng với quẻ \"Hổ lạc thâm khanh\", thật là \"Cát ít hung nhiều\".\n" +
                "* Lời thơ của quẻ Bĩ:\n" +
                "Hổ sa hố sâu thật là thảm,\n" +
                "Tiến lên thì dễ, rút về khó.\n" +
                "Học hành, buôn bán đều không được,\n" +
                "Cãi cọ liên miên, bệnh tật hoài.\n" +
                "* Lời đoán:\n" +
                "Của mất khó tìm, giao dịch buôn bán không thành, hôn nhân bất lợi, góp vốn thua thiệt.\n" +
                "* Lời bàn: Âm dương không giao hòa là Bĩ. Âm dương không hòa hợp, muôn vật không sinh, mọi sự đều tắc. Trong lúc tình trạng mọi sự đều bế tắc, con người muốn việc hanh thông cũng không được. Giống như hổ sa vào bẫy, mất hết uy lực. Hạn quẻ Bĩ là hạn sa cơ lỡ bước, nếu biết chờ thời, qua cơn vận Bĩ thì tốt, còn hành động cầu danh, cầu lợi thì không những tiền mất tật mang mà còn nguy đến tính mạng.\n" +
                "Lời giải: Ách tắc, hung nhiều lành ít.\n" +
                "\"Bĩ\" tức là \"bị tắc, bị nghẽn\", \"không thông\". Chữ \"Bĩ\" triết tự thành hai chữ \"bất\", \"khẩu\" tức \"có khổ khó nói\", \"há miệng mắc quai\" không thể biện bạch, thật là cấn cá.\n" +
                "Kinh Dịch dùng câu \"Thiên địa bất giao\" để giải thích cảnh \"bĩ\", lại dùng câu \"Hổ lạc thâm khanh\" để miêu tả cảnh \"bĩ\". Hổ đã rơi xuống hố sâu mất hết uy lực giống như kẻ sa cơ lỡ bước, giờ muốn quay lại thì đã muộn. Khi đã rơi vào cảnh bĩ thì tiến lui đều không được, chỉ biết chờ vận bĩ hết mới có thể thoát được.\n" +
                "Luận đoán tài vận:\n" +
                "Tài vận của bạn e rằng rất xấu, nguyên nhân phần lớn là do \"tắc nghẽn\" đầu vào, đầu ra. Nếu bị rơi vào cảnh này, bạn chỉ có nhờ cậy vào bạn bè giúp đỡ. Bạn không thể tự mình thoát ra được.\n" +
                "Bạn cũng có thể kiên nhẫn chờ vận bĩ qua đi, chỉ mong sao mọi việc đừng xấu hơn. Bạn cũng không nên sốt ruột, vì \"bĩ cực\" sẽ \"thái lai\" tức vận bĩ đến cực điểm sẽ đến vận hanh thông. Thường vận bĩ kéo dài 3 tháng."))
        hexagrams.add(Hexagram("000010", "QUẺ THIÊN HỎA ĐỒNG NHÂN", R.drawable.i13, "\"Tiên Nhân Chi Lộ\" – \"Đi đâu cũng lợi\".\n" +
                "\"Đồng nhân\" nghĩa là đồng tâm nhất trí với mọi người, vì thế mới có hình tượng \"Tiên nhân chỉ đường\".\n" +
                "\"Tiên nhân chỉ đường\" là chuyện một đoàn người bị lạc đường, trong lúc đang hoang mang bỗng có một tiên nhân đến chỉ con đường đúng. Người gieo được quẻ này có điềm \"đi đâu cũng lợi\".\n" +
                "* Hình tượng của quẻ nói:\n" +
                "Rất nhiều việc không biết làm thế nào cho đúng, khiến tâm trạng lo lắng buồn rầu. May gặp được nhà thông thái sáng suốt chỉ bảo, mọi lo lắng, u sầu tiêu tan.\n" +
                "* Lời đoán:\n" +
                "Hôn nhân tất thành, người đi trở về, của mất tìm thấy, làm việc không sai.\n" +
                "* Lời bàn:\n" +
                "Con người không có kinh nghiệm, không có đạo đức thường u mê trước các sự việc phức tạp, khó khăn. Nếu không có các cố vấn, chuyên gia am hiểu, dễ dẫn đến sai lầm làm hỏng, làm sai. Những việc liên quan đến kỹ thuật, máy móc không phức tạp bằng những việc liên quan đến con người, vì thế nếu không có tiên nhân, tức những nhà thông thái chỉ bảo, chỉ thất bại mà thôi.\n" +
                "Lời giải: Đồng tâm nhất trí thì sẽ thành công. Đi đâu cũng lợi, làm gì cũng nên.\n" +
                "\"Đồng\" có nghĩa là \"chung\", \"cùng chung\". \"Đồng nhân\" là kẻ cùng chí hướng, cùng lợi ích, cùng chung kẻ thù…đoàn kết liên minh với nhau để sống, chiến đấu, kinh doanh, buôn bán. Người cùng chí hướng càng đông, sức mạnh càng lớn, thành công càng nhanh.\n" +
                "Kinh Dịch dùng cụm từ \"Thiên Dữ Hỏa\" \"trời và lửa) giải thích quẻ \"Đồng Nhân\", có ý nhắc nhở ta nên kết giao với kẻ cùng chí hướng. Kẻ sáng suốt quang minh chính đại mới dùng được quẻ này. Kẻ tiểu nhân thì kẻ y yêu quý dù làm sai cũng không sao, kẻ y ghét thì dù làm đúng cũng vẫn bị y hãm hại. Vì vậy mới có câu \"chỉ có quân tử mới có thể tập hợp được chí của mọi người\" (Kinh Dịch – quẻ Đồng Nhân).\n" +
                "Luận đoán tài vận:\n" +
                "Đang tài lộc tốt, phần lớn nhờ quan hệ bạn bè. Nếu được bạn bè tốt giúp đỡ thì đại lợi. Nhưng nếu kết lầm bạn xấu, chẳng những kinh doanh thất lợi, sự nghiệp không còn. Kinh Dịch nói: \"Đồng nhân chi tiên, dĩ trung trực dã\" (Muốn được người cùng chung chí hướng ủng hộ, trước tiên phải trung thực, chính trực). Quân tử có thể \"đồng nhân\", tiểu nhân chỉ hại người."))
        hexagrams.add(Hexagram("010000", "QUẺ HỎA THIÊN ĐẠI HỮU", R.drawable.i14, "\"Khảm Thụ Mô Tước\" – \"Làm việc chắc chắn\".\n" +
                "\"Đại hữu\" có nghĩa là tất cả đất đai rộng lớn, có hàm nghĩa bao gồm cả trên lẫn dưới, vì vậy mới có hình tượng \"chặt cây bắt sẻ\".\n" +
                "\"Khảm thụ mô tước\" là chuyện một người nhìn thấy trên cây có tổ chim sẻ, muốn bắt sẻ đã quyết định chặt đổ cây. Người gieo được quẻ này có điềm \"Làm việc chắc chắn\".\n" +
                "* Hình tượng của quẻ: Chặt cây lớn bắt sẻ non là một việc chắc chắn thành công, nếu chỉ nhìn mà không làm đúng cách, không bắt được sẻ.\n" +
                "* Lời đoán:\n" +
                "Việc chưa hiểu kỹ thì không làm, phải làm theo cách chắc chắn thành công. Có như vậy, cầu danh cầu lợi mới thành.\n" +
                "* Lời bàn: Có nhiều cách để đạt được thành công. Cách làm chắc chắn là cách loại trừ được mọi nguyên nhân dẫn đến rủi ro, thất bại. Trước khi làm một việc gì, ta cũng phải nghĩ đến những khó khăn, nguy hiểm rủi ro sẽ xảy ra để tìm cách tránh hoặc tìm cách hạn chế.\n" +
                "Lời giải: \"Khảm thụ mô tước\" chặt cây bắt sẻ, chắc chắn thành công (quẻ tốt thì trong 64 quẻ chỉ đứng sau quẻ Ký Tế).\n" +
                "\"Đại hữu\" bao hàm tất cả, có tượng vàng ngọc đầy nhà, thu vào quá lớn, lại có tượng cách \"chặt cây bắt sẻ\". Sẻ non ở trên cây, bay không được, vì vậy dễ dàng bị bắt.\n" +
                "Kinh Dịch dùng cụm từ \"Hỏa tại thiên thượng\" để miêu tả quẻ Đại Hữu. Lửa ở trên trời, ánh sáng rực rỡ, chiếu sáng khắp nơi.\n" +
                "Kinh Dịch nói: \"Ẩn ác dương thiện\" nhắc ta hãy từ bỏ việc xấu việc ác, phát huy điều thiện. Vì vậy, quẻ này còn có hàm nghĩa bỏ cái ác, theo cái thiện mới quang minh lỗi lạc.\n" +
                "Gặp quẻ Đại Hữu, mọi việc hanh thông. Quẻ Đại Hữu còn có ý \"hòa khí sinh tài\". Vua gặp quẻ này thì thịnh trị, quan gặp quẻ này thì hanh thông, dân được quẻ này thì no ấm.\n" +
                "Luận đoán tài vận:\n" +
                "Gieo được quẻ này thì coi như gặp đại kỳ phúc, không gì tốt bằng. Chỉ có điều bạn làm gì cũng phải quang minh lỗi lạc, chớ có hành xử như kẻ tiểu nhân hèn mạt hại người. Tuy vậy cũng không nên xử sự quá nhút nhát, mềm yếu, sợ mọi người cho là nhu nhược."))
        hexagrams.add(Hexagram("111011", "QUẺ ĐỊA SƠN KHIÊM", R.drawable.i15, "\"Nhị Nhân Phân Kim\" – Vạn sự hanh thông.\n" +
                "\"Khiêm\" có nghĩa là \"khiêm tốn, nhường nhịn\", không tự cao tự đại, tự cho mình là đúng, vì thế nó có hình tượng của hai kẻ chia vàng.\n" +
                "\"Nhị nhân phân kim\" là chuyện hai kẻ nghèo khổ, cùng chung hoạn nạn vui buồn có nhau, bỗng nhặt được một cục vàng, vui vẻ chia đôi, không hề tranh nhau. Gieo được quẻ này là điềm \"vạn sự hanh thông\".\n" +
                "* Hình tượng của quẻ: Trời cho 2 người nghèo một thỏi vàng, không tranh không cướp, chia 2 phần bằng nhau. Sau khi chia, vàng cầm trong tay, ai cũng vừa lòng.\n" +
                "* Lời đoán: Hôn nhân như ý, xuất hành có lợi, giao dịch tốt đẹp, góp vốn được lợi, việc gì cũng cát lợi.\n" +
                "* Lời bàn: Quẻ Khiêm là quẻ có đạo hanh thông. Có tài có đức mà không công khai thừa nhận gọi là \"khiêm\". Xử sự khiêm nhường thì việc gì mà chẳng hanh thông. Không khoe tài, không tranh khôn, không kiêu căng là biết tôn trọng kẻ khác vậy.\n" +
                "Lời giải: \"Nhị nhân phân kim\", chia đều thì vạn sự hanh thông.\n" +
                "\"Khiêm\" có nghĩa là khiêm tốn. Kinh Dịch nói: \"Khiêm giả, kiêm dã\" (quẻ Khiêm, bao dung vậy). Nếu có thái độ khiêm tốn, bao dung mới có đủ trí óc sáng suốt để xem xét ý kiến bất đồng, quan điểm trái ngang của người khác. Kinh Dịch dùng cụm từ \"Địa Trung Hữu Sơn\" (trong đất có núi) để miêu tả quẻ này. Núi cao vậy, nặng như vậy đất còn bao dung được, huống hồ là cái khác. Đây là hiện tượng bao dung. Có khiêm tốn mới có thể hanh thông, xử sự có thủy có chung. Khiêm tốn, nhún nhường mới có thể lâu dài được. Cấp trên mà khiêm tốn thì cấp dưới mới mến phục. Kẻ tự cao tự đại, thường học thấp, biết ít nên thường dùng cách trừng phạt lung tung để ra oai.\n" +
                "Luận đoán tài vận:\n" +
                "Nếu bạn xử sự công bằng thỏa đáng, bao dung khiêm tốn thì tài vận của bạn rất tốt. Cổ nhân có câu \"hòa khí sinh tài\" chỉ bụng dạ không hẹp hòi, kẻ có công được thưởng, kẻ có tội được tha thứ, biết dung nạp ý kiến của kẻ dưới, biết lắng nghe ý kiến khác với quan điểm của mình mới có thể kinh doanh buôn bán thành công được."))
        hexagrams.add(Hexagram("110111", "QUẺ LÔI ĐỊA DỰ", R.drawable.i16, "\"Thanh Long Đắc Thủy\" – Gặp hung hóa cát.\n" +
                "\"Dự\" có nghĩa là \"vui vẻ hòa hợp\", lòng người vui vẻ hòa hợp, vì thế nó có hình tượng \"rồng xanh gặp nước\".\n" +
                "\"Thanh long đắc thủy\" là chuyện Khương Thái Công trên đường gặp hổ râu rồng, biết địch không nổi, song yêu quái lại bái Thái Công làm thầy. Người gieo được quẻ này là điềm \"Gặp hung hóa cát\".\n" +
                "* Hình tượng của quẻ nói: Khương Thái Công cắm cờ vàng, thu phục yêu quái làm đồ đệ trở về Tây Kỳ, từ đó như \"thanh long đắc thủy\", thỏa chí vẫy vùng, mọi việc như ý, vạn sự hanh thông.\n" +
                "Ngày xưa, Đường Tam Tạng phụng mệnh đi Tây Trúc lấy kinh đã gieo được quẻ này. Quả nhiên khi đến Ngũ hành sơn, ông đã thu phục được Tôn Ngộ Không. Dọc đường, Tôn Ngộ Không lại hàng phục được yêu quái, bảo vệ Đường Tăng lấy được Kinh Phật mang về. Đúng là ứng với quẻ \"Thanh long đắc thủy\", thật là \"gặp hung hóa cát\".\n" +
                "* Lời thơ của quẻ Dự:\n" +
                "Thanh long đắc thủy, vạn sự vui,\n" +
                "Cầu tài cầu lộc, được hanh thông.\n" +
                "Hôn nhân, xuất hành không trở ngại,\n" +
                "Cãi cọ, bệnh tật, cũng tiêu tan.\n" +
                "* Lời đoán:\n" +
                "Giao dịch thành công, người đi sẽ về, góp vốn dễ dàng.\n" +
                "* Lời bàn:\n" +
                "\"Dự\" là \"vui vẻ hợp hòa\". Muốn có vui vẻ hòa hợp phải đồng thuận. Trong nhà hòa thuận, mọi người trong nhà vui vẻ. Nhưng vui quá sẽ khiến người ta mê muội, hợm hĩnh, mất cảnh giác. Vì vậy, sau khi thắng lợi, người ta rất dễ đắm chìm trong niềm vui, không thấy bao nguy hiểm đang rình rập, chỉ chờ có cơ hội thuận lợi là tấn công ngay.\n" +
                "Lời giải: Thanh long đắc thủy, gặp hung hóa cát.\n" +
                "\"Dự\" có nghĩa là \"vui vẻ mãn nguyện\", \"hòa hợp\". Kinh Dịch nói: \"Lôi xuất địa phấn\" tức \"trống trận vang lên, lòng quân phấn chấn\". Ngày xưa lấy tiếng trống làm hiệu lệnh tấn công. Trong gia đình, họ hàng, cơ quan, muốn yên vui phải hành động theo lẽ phải. Nếu quá đắm đuối vui chơi trở nên yếu đuối nhu nhược thì lại hung, không thể lâu dài. Thường sau khi thành công, thường người ta hay say sưa mê muội, tự cao tự đại, thậm chí mất hết ý chí. Quẻ này khuyên chúng ta phải cảnh giác với việc vui, chớ say sưa kéo dài, dẫn tới nhu nhược, tối tăm, mê muội.\n" +
                "Luận đoán tài vận:\n" +
                "Gieo được quẻ này giống như \"thanh long đắc thủy\" dẫu gặp sự hung cũng hóa cát. Bạn có thể còn do dự khi kinh doanh làm ăn, lo lắng được mất, lỗ lãi. Quẻ này có tượng động mà hòa thuận, nên yên vui. Vì vậy, bạn hành động theo lẽ phải, thuận mua vừa bán thì gặp hung hóa cát.\n" +
                "Đạo của Kinh Dịch kỳ diệu ở chỗ biến hóa thay đổi có khi \"gặp hung hóa cát\", \"gặp cát hóa hung\", giữ đạo trung dung, bởi cái gì quá thái đều xấu."))
        hexagrams.add(Hexagram("100110", "QUẺ TRẠCH LÔI TÙY", R.drawable.i17, "\"Thôi Xa Kháo Nhai\" – \"Lên cao từng bước\".\n" +
                "\"Tùy\" có nghĩa là \"thuận\", \"thuận theo sự vật\", vì vậy nó có hình tượng \"Dựa bờ đẩy xe\".\n" +
                "\"Dựa bờ đẩy xe\" là chuyện một người đẩy xe sa vào bãi lầy có nhiều bùn đặc sánh, tốn bao công sức không kéo được xe lên. Sau khi dựa vào bờ đất đã đẩy được xe ra khỏi bãi lầy, đến chỗ đường sỏi đá, dần dần mới cảm thấy thoải mái. Gieo được quẻ này là điềm \"lên cao từng bước\".\n" +
                "* Hình tượng của quẻ nói: Dẫm chân trong bùn mấy năm nay, nay phải dựa vào bờ đất mà đẩy xe lên cao dần dần, phải cố hết sức lực bước ra khỏi vũng lầy mới có thể làm ăn phát tài được.\n" +
                "* Lời đoán của quẻ:\n" +
                "Khổ tận cam lai, vui vẻ phấn khởi, mọi sự dần dần như ý.\n" +
                "* Lời bàn:\n" +
                "\"Kháo nhai\" là dựa vào bờ đất cứng. Làm việc gì cũng phải có chỗ dựa. Chỗ dựa là điều kiện tất yếu của công việc. Vật mang tính ấm không thể tự lập, tất phải theo vật mang tính dương. Vật dương cũng có chính tà, theo chính thì thành công hạnh phúc, theo tà thì thất bại bất hạnh.\n" +
                "Lời giải: Lựa gió căng buồm, tiến lên từng bước.\n" +
                "\"Tùy\" có nghĩa là \"thuận\" , \"thuận theo\". Quẻ Tùy là âm nhỏ thuận theo âm lớn, âm nhỏ tất vui vẻ mà theo. Thuận theo thì được cả \"nguyên hanh lợi trinh\". Đạo của quẻ Tùy là \"tùy thời\", \"tùy theo hoàn cảnh\", người trên phải lụy kẻ dưới thì kẻ dưới sẽ đẹp lòng.\n" +
                "Kinh Dịch dùng cụm từ \"Như thủy thôi chu\" (như nước đẩy thuyền) để giải thích quẻ Tùy, có ý nhắc nhỏ ta phải đi xuôi dòng. Nếu đi ngược dòng vừa tổn hao sức lực vừa dễ gặp nguy.\n" +
                "Đạo gia cũng dùng chữ \"thuận\" để nói rõ tinh thần của quẻ Tùy. Thuận theo thiên thời (quy luật tự nhiên) mọi việc cát tường, thuận lợi dễ thành công.\n" +
                "Luận đoán tài vận:\n" +
                "Gieo được quẻ này tài vận rất tốt. Bạn không nên giữ ý kiến của mình. Đây là quẻ thuận, vì vậy nên căn cứ vào tình hình thực tế, nếu cứ hành động theo ý mình, bất chấp kết quả ra sao sẽ thất bại. Nếu theo ý kiến của người khác thì kết quả tốt đẹp. Đạo của quẻ Tùy là biết lợi dụng điều kiện, nhân tố khách quan có lợi để đạt mục đích. Vì vậy, bạn phải phát hiện nhân tố nào có lợi cho kinh doanh để sử dụng."))
        hexagrams.add(Hexagram("011001", "QUẺ SƠN PHONG CỔ", R.drawable.i18, "\"Thôi Ma Sá Lộ\" – Làm không đúng cách.\n" +
                "\"Cổ\" tức là \"xấu, dở, tồi\", khi sự việc phát triển đến cùng cực sẽ xảy ra hiện tượng \"cổ\", vì thế nó có hình tượng kéo cối xay không đúng đường.\n" +
                "\"Thôi ma sá lộ\" là chuyện ngựa kéo cối xay bột không đi đường vòng tròn mà chệch ra ngoài, lật đổ cối xay bột, khiến lòng người hoảng hốt. Kẻ gieo phải quẻ này là điềm \"làm không đúng cách\".\n" +
                "* Hình tượng của quẻ nói rằng:\n" +
                "Hình tượng các hào trong quẻ giống như kéo xe xay bột, đúng cách (thuận chiều) thì phúc, không đúng cách (lệch hướng, ngược hướng) là họa. Gặp việc nên bình tĩnh suy xét, nếu không dễ sai lầm gây họa cho mình.\n" +
                "* Lời đoán: Xuất hành bất lợi, hôn nhân bất thành, của mất không về, mọi sự trục trặc.\n" +
                "* Lời bàn: Làm không đúng cách là làm không đúng chỗ, đúng lúc, đúng đối tượng, làm lệch, làm sai, làm ngược, làm trái lẽ thông thường, kết quả hỏng việc, gây rối loạn. \"Dưới chống trên, con chống cha\" là loạn vậy.\n" +
                "Lời giải: Tình rối loạn, đề phòng kẻ tiểu nhân hèn hạ.\n" +
                "\"Cổ\" là giống bọ rất độc có thể gây chết người trong truyền thuyết. Đạo gia nói: \"Cổ giả, sự dã\" tức \"quẻ Cổ sinh sự mê hoặc lòng người\". Kẻ tiểu nhân hèn hạ reo rắc dư luận xấu hại người trung thực, nhằm làm thiên hạ rối loạn. Quẻ Cổ là nát suy tận cùng. Con gái trưởng lấy con trai út là loạn về tình, khiến mọi việc rối tung, lòng người hoảng hốt. Trên dù không bất chính hạ vẫn tắc loạn. Trên dưới không giao hòa sinh ra rối loạn, dưới chống trên còn sinh ra đại loạn.\n" +
                "Luận đoán tài vận:\n" +
                "Gieo phải quẻ Cổ bạn phải hết sức phòng kẻ tiểu nhân hèn hạ. Bọn chúng chẳng khác nào sâu bọ rất độc, sẵn sàng hại người. Tài vận của bạn hết sức tồi tệ. Quẻ Cổ nhắc bạn nhiều khả năng có kẻ đang phá hoại công việc của bạn, hoặc có chuyện vô cùng xấu, sắp xảy ra ảnh hưởng đến công việc của bạn."))
        hexagrams.add(Hexagram("111100", "QUẺ ĐỊA TRẠCH LÂM", R.drawable.i19, "\"Phát Chính Thi Nhân\" – Thời vận hanh thông.\n" +
                "\"Lâm\" tức là \"trên đến với dưới\", đất ở trên bờ giáp với đầm nước, có ý chỉ sự gần dân, vì thế nó có hình tượng thực hiện chính sách thi hành nhân đức.\n" +
                "\"Phát chính thi nhân\" là chuyện vua cuối cùng nhà Thương là Trụ Vương đặt ra thuế khóa nặng nề, xây dựng lâu đài, xây hồ chơi bời, dâm loạn, hình phạt thảm khốc, khiến cho dân chúng điêu linh, khốn khổ như sống trong lò lửa. Văn Vương sửa sang chính sự, làm việc nhân nghĩa, khiến cho dân chúng yên ổn làm ăn. Kẻ gieo được quẻ này có điềm \"thời vận hanh thông\".\n" +
                "* Hình tượng của quẻ Lâm:\n" +
                "Nhà vua vô đạo, dân chúng điêu linh, muốn lật đổ vương triều thối nát, may có minh chủ thi hành chính sách nhân đức, khiến dân an cư, vui vẻ sinh sống làm ăn.\n" +
                "* Lời đoán: Cãi cọ mất hết, bệnh tật tiêu tan, cầu danh như ý, cầu lộc phát tài, gia cảnh an khang.\n" +
                "* Lời bàn: Thi hành nhân đức, được cả thiên hạ, giúp đỡ mọi người vạn sự hanh thông.\n" +
                "Lời giải: Giúp đỡ mọi người, vạn sự hanh thông.\n" +
                "\"Lâm\" có nghĩa là người trên đến với người dưới, gần gũi với người dưới. Đạo gia định nghĩa \"Lâm\" là \"lớn\". Lâm có tượng cấp trên đến với người cấp dưới, quân tử đến với tiểu nhân.\n" +
                "Kinh Dịch dùng cụm từ \"Trên đầm có đất\" để chỉ tượng của quẻ Lâm. Đất trên hồ đầm tức là bờ hồ, bờ đầm, vì vậy Kinh Dịch cổ viết chữ lâm (đến) thành chữ lâm (rừng). Đất dùng để ngăn nước, quân tử dạy dỗ giúp đỡ mọi người. Đạo của quẻ Lâm cao thượng biết bao.\n" +
                "Luận đoán tài vận:\n" +
                "Trên gần với dưới là để giám sát, đôn đốc, kiểm tra, khống chế dưới. Bạn là người kinh doanh càng cần phải giám sát kiểm tra. Kiểm tra toàn diện, phát hiện những kẽ hở, những chỗ bất hợp lý, những nhân tố cản trở công việc kinh doanh.\n" +
                "Kinh doanh của bạn đang tiến triển tốt đẹp, song vẫn cần định ra một chế độ làm việc có kỷ luật chặt chẽ với những nguyên tắc đảm bảo hoạt động kinh doanh có hiệu quả, an toàn."))
        hexagrams.add(Hexagram("001111", "QUẺ PHONG ĐỊA QUÁN", R.drawable.i20, "\"Hạn Hà Đắc Thủy\" – Quý nhân phù trợ.\n" +
                "\"Quán\" có nghĩa \"được mọi người kính phục\", vì thế nó có hình tượng sen hạn được nước.\n" +
                "\"Hạn Hà đắc thủy\" là chuyện đầm sen khô hạn, hoa sắp héo tàn, bỗng trời mưa to, hoa sen nở rộ. Người gieo được quẻ này có điềm \"Quý nhân phù trợ\".\n" +
                "Hình tượng của quẻ Quán:\n" +
                "Hoa sen mọc ở trong đầm đang ra hoa kết hạt, lại gặp trời không mưa, trong đầm dần dần cạn nước. May mà thời tiết thay đổi, mưa xuống ầm ầm, hồ ao đầy nước, hoa sen nở rộ, cành lá tốt tươi.\n" +
                "Lời đoán: Của mất lại về, cãi cọ mất hết, bệnh tật tiêu tan, gặp thời gặp vận, quý nhân phù trợ.\n" +
                "Lời bàn: Đại hạn gặp mưa rào là gặp thời vận thuận lợi. Muốn được mọi người kính phục phải giúp người thoát khỏi đại nạn, cứu người sắp chết. Con người chỉ khi đó mới thực sự cảm ân, mới thực sự kính phục người cứu nạn.\n" +
                "Lời giải: Quý nhân phù trợ.\n" +
                "\"Quán\" có hai nghĩa, đọc là \"quan\" có nghĩa là xem xét, quan sát, có tính chủ động; đọc là \"quán\" có nghĩa là được xem xét, được quan sát, có tính bị động. Khi một người được mọi người xem xét quan sát những biểu hiện tốt có nghĩa là lời nói hoặc hành vi tốt đẹp của người đó, là tấm gương cho mọi người noi theo. Quẻ Quán là quẻ tịnh hóa tâm linh (tu dưỡng đạo đức, giữ cho tâm hồn trong sáng thuần khiết) trong tôn giáo. Kinh Dịch nói: \"Quán, quán nhi bất tiến\". \"Quán\" (từ thứ hai) chỉ việc rửa tay trước khi tế lễ; \"tiến\" là chỉ việc giết bò giết dê tế lễ. \"Quán nhi bất tiến\" là chỉ việc tế lễ chỉ cần rửa tay, tắm rửa sạch sẽ, không cần phải giết bò giết dê.\n" +
                "Luận đoán tài vận:\n" +
                "Đường tài lộc của bạn phụ thuộc vào sự may mắn, được người sang giúp đỡ. Điều quan trọng bạn phải giữ tâm hồn trong sáng, tránh việc sát sinh. Bạn chỉ cần buôn bán trung thực, thành thực giúp đỡ người, có lời nói và hành vi đúng mực, con đường buôn bán hoặc sự nghiệp tự nhiên tốt đẹp. Đạo của quẻ Quán vô cùng trang nghiêm, cung kính lễ phép."))
        hexagrams.add(Hexagram("010110", "QUẺ HỎA LÔI PHỆ HẠP", R.drawable.i21, "\"Cơ Nhân Ngộ Thực\" – Gặp may gặp mắn.\n" +
                "\"Phệ\" là \"cắn, gậm, gậm nhấm\"; \"Hạp\" là \"hợp\". \"Phệ Hạp\" là \"khớp vào với nhau\", vì thế mới có hình tượng người đói gặp ăn.\n" +
                "\"Cơ nhân ngộ thực\" là chuyện một người ba ngày không ăn, đói không ra khỏi cửa. Ngẫu nhiên có người tốt đưa cơm đến cứu giúp. Người đói dần dần khỏe lại. Kẻ gieo quẻ này là điềm \"Gặp may mắn\".\n" +
                "Hình tượng của quẻ Phệ Hạp:\n" +
                "Khi bị đói, có người mang cơm cho, sau khi ăn no, trong lòng vui vẻ, buồn rầu từ đó mất dần.\n" +
                "Lời bàn: Khi đói có người cho ăn, khi rét có người cho áo, thật đúng là \"một miếng khi đói bằng một gói khi no\". Giúp người cũng cần phải đúng đối tượng. Giúp người đang đói thì làm ơn không mang oán. Cho người lúc no thì không có tác dụng thi ân.\n" +
                "Lời giải: Vô cùng may mắn.\n" +
                "\"Phệ Hạp\" là hiện tượng dùng răng cắn thức ăn vì thức ăn khó cắn nên còn phải gậm từng tý một. \"Hạp\" có nghĩa là \"khớp lại với nhau\". Phệ Hạp có ý chỉ trong thiên hạ có nhiều kẻ chống đối, chỉ có trừng phạt mới trị được thiên hạ. Kinh Dịch dùng câu \"Phệ Hạp hanh, lợi dụng hình\" chỉ quẻ Phệ Hạp hanh thông, lợi về sử dụng hình phạt. Trong thiên hạ mọi việc không thông vì có sự cản trở ngăn cách, loại bỏ cản trở, ngăn cách thì mới thống nhất (khớp vào nhau). Quẻ Phệ Hạp vừa có sấm vừa có chớp, âm dương cương nhu tương giao ví như con người vừa dùng ân uy, khoan dung nghiêm khắc kết hợp mới giải quyết được sự việc.\n" +
                "Luận đoán tài vận:\n" +
                "Gieo được quẻ này, bạn nên nhớ câu \"dục tốc bất đạt\". Mọi việc chớ mong nhanh cầu chóng. Bạn phải hành động hết sức từ từ, tiến lên từng bước. Khi gặp khó khăn phải làm rõ mọi nguyên nhân mới hành động. Quẻ này còn khuyên ta chớ tham lợi nhỏ mà mắc lừa. Nếu muốn thông suốt, thuận lợi đôi khi phải dùng biện pháp trừng phạt để giải quyết."))
        hexagrams.add(Hexagram("011010", "QUẺ SƠN HỎA BÍ", R.drawable.i22, "\"Hỷ Khí Doanh Môn\" – \"Vạn sự như ý\".\n" +
                "\"Bí\" có nghĩa là \"trang sức\"; vật được trang sức, vì thế mới có hình tượng không khí vui mừng đầy nhà.\n" +
                "Hình tượng của quẻ Bí: Thời thế xoay chuyển theo vòng tròn, \"yểu điệu thục nữ quân tử hảo cầu\", chiêng trồng vang lên, đại khánh cát, vui mừng phấn khởi khắp nơi nơi.\n" +
                "Ngày xưa, Nam Dung là học trò đạo Khổng đã từng gieo được quẻ này. Quả nhiên, Nam Dung nhiều lần hành lễ, được thánh nhân phù giúp, sau đó lấy vợ hiền. Đúng là ứng với quẻ \"Hỷ khí doanh môn\", thật là \"Vạn sự như ý\".\n" +
                "Lời đoán: Xuất hành cát tường, vạn sự hanh thông, của mất tìm thấy.\n" +
                "Lời bàn: Người gặp việc vui thì tinh thần phấn chấn. Trang trí là để tạo ra và gìn giữ không khí vui vẻ, phấn chấn được lâu dài. Không khí vui vẻ, dáng vẻ phấn chấn chỉ là bề ngoài nhưng phải có khí chất của thánh đức, làm việc thiện, việc nhân đức thì mới lâu dài được.\n" +
                "Lời giải: Vạn sự như ý.\n" +
                "\"Bí\" có nghĩa là \"trang sức\", \"văn vẻ\" vì thế mới có hình tượng không khí vui vẻ đầy nhà. Quẻ Bí miêu tả đám cưới thời cổ đại. Người đi dự đám cưới đều đeo đồ trang sức đẹp nhất của mình để thể hiện mình. Vì vậy, quẻ Bí còn có nghĩa che giấu chân tướng, khoe mẽ, ba hoa, ra vẻ ta đây. Trang sức đến khi sáng sủa thì dùng, trang sức lòe loẹt thì có hại. Tục ngữ có câu \"người gặp việc vui thì tinh thần phấn chấn\". Trang trí để giữ không khí vui vẻ, tinh thần phấn chấn lâu dài. Đạo của quẻ Bí là quang minh thông đạt, vì vậy hành động phải quang minh chính đại, chớ làm điều gì mờ ám, xấu xa hèn hạ.\n" +
                "Luận đoán tài vận:\n" +
                "Bạn không nên nhầm lẫn chữ \"bí\" này với chữ \"bí\" trong \"thế bí\", chữ \"bí\" trong \"bí hiểm\". Tài vận của bạn phụ thuộc vào hai điều kiện bạn có biết \"trang sức\", \"làm đẹp\" hàng của bạn không? Bạn chi tiền quảng cáo để tăng lượng khách hàng mua sản phẩm của bạn không?\n" +
                "Vấn đề quyết định tài vận của bạn ở chỗ chất lượng sản phẩm của mỗi đợt hàng đưa ra thị trường, nhưng bạn cũng đừng coi thường nhãn mác bao bì của sản phẩm."))
        hexagrams.add(Hexagram("011111", "QUẺ SƠN ĐỊA BÁC", R.drawable.i23, "\"Oanh Thước Đồng Lâm\" – \"Việc làm không thành\".\n" +
                "\"Bác\" có nghĩa là \"gọt\", \"lột\", \"rơi\". Khí âm bay lên, khí dương đi xuống, vì thế nó có hình tượng chim oanh chim khách cùng ở một rừng.\n" +
                "\"Oanh thước đồng lâm\" là chuyện có một con chim khách nhỏ, trời tối lạc đàn trú tạm trong rừng. Không ngờ trong rừng có con chim hoàng oanh thấy chim khách sinh ra ác ý. Kẻ gieo phải quẻ này, chủ là quẻ tiểu nhân đố kỵ, có điềm \"Việc làm không thành\".\n" +
                "Hình tượng: Chim khách vì trời tối phải vào ngủ trong rừng, không ngờ trong rừng đã có chim oanh ở. Chim oanh trông thấy chim khách, trong lòng ghen ghét, đố kỵ sinh ra ác ý.\n" +
                "Lời đoán: Mọi sự không thông, người đi không về, mất của khó tìm, cầu lợi không được.\n" +
                "Lời bàn: Là người ai cũng có lòng đố kỵ, song đố kỵ như chim oanh đối với chim khách thì thật là quá quắt. Đạo làm người là sống đúng đắn, giúp đỡ lẫn nhau, song giúp kẻ bất nghĩa thì thật là đáng buồn.\n" +
                "Lời giải: \"Bác\" có nghĩa là \"bóc\", là \"lột\". Đạo gia dùng chữ \"lạc\" (rụng) để giải thích quẻ Bác. Quẻ Bác là quẻ xem tháng 9 hàng năm, tháng cuối của mùa thu. Hàng năm ở vùng ôn đới 4 mùa rõ rệt, cứ đến tháng 9 mùa thu, trời bắt đầu có sương, gió thổi mạnh, lá phong bắt đầu rụng lá. Kẻ gieo phải quẻ này bị tiểu nhân đố kỵ, việc làm không thành. Đây là quẻ âm thịnh dương suy, tiểu nhân ghen ghét đố kỵ, xuất hành thăm viếng đều bất lợi. Người quân tử muốn tồn tại phải liên kết với nhau cùng chống kẻ tiểu nhân thì mới tồn tại được.\n" +
                "Luận đoán tài vận:\n" +
                "Gieo phải quẻ này tài vận không tốt. Đường tài lộc như lá rụng mùa thu. Đây là thời kỳ dẫm chân tại chỗ của bạn trong kinh doanh, sự nghiệp. Nguyên nhân có thể có kẻ tiểu nhân ghen ghét đố kỵ, gây cản trở công việc làm ăn của bạn.\n" +
                "Đứng trước cảnh \"bác\" vị cản trở, bạn nên tìm đồng nghiệp tốt, liên kết liên doanh, dựa vào tài khí của họ để duy trì công việc kinh doanh của mình."))
        hexagrams.add(Hexagram("111110", "QUẺ ĐỊA LÔI PHỤC", R.drawable.i24, "\"Phu Thê Phản Mục\" – \"Tráo trở lật lọng\".\n" +
                "\"Phục\" có nghĩa là \"chống lại\", thay dạ đổi lòng, vì thế nó có hình tượng vợ chồng bất hòa.\n" +
                "\"Phu thê phản mục\" là chuyện Khương Tử Nha khi còn hàn vi, thậm chí khốn cùng, Mã thị là người vợ đanh đá, thường gây sự cãi nhau. Kẻ gieo phải quẻ này là người khác thường, có điềm \"Tráo trở lật lọng\".\n" +
                "Lời đoán: Hiện tại không lành, tình cảm không có, chỉ nhũn nhẫn, nhịn nhường, may ra được yên ổn.\n" +
                "Lời bàn: Đạo vợ chồng là đạo âm dương, là gốc của mọi vấn đề. Thiếu dương thì âm cũng cực, thiếu âm thì dương cũng không phát triển. Âm dương giao hòa được là do âm có thuận theo dương không. Âm không theo dương, thậm chí chống lại dương thì tình cảm đổ vỡ, gia đình bất hạnh.\n" +
                "Lời giải: Lúc xấu lúc tốt.\n" +
                "\"Phục\" tức là trở đi trở lại. Kinh Dịch có câu \"Phục hanh, xuất nhập vô tật, bằng hữu vô cữu, phản phúc kỳ đạo\". Ý câu này nói: \"Quẻ Phục thông, bất luận tình hình thay đổi như thế nào. Sự khác biệt sẽ không lớn, cuối cùng vẫn không sao. Bạn bè không lỗi, trở đi trở lại\".\n" +
                "Thực ra, quẻ Phục miêu tả quy luật tuần hoàn của tự nhiên như 4 mùa, xuân, hạ, thu, đông, trăng tròn khuyết… Rất nhiều hiện tượng tự nhiên và xã hội hoạt động theo quy luật tuần hoàn. Vì vậy, khi tình hình tốt phải chuẩn bị đối phó với tình hình xấu.\n" +
                "Luận đoán tài vận:\n" +
                "Tài vận của bạn lúc tốt lúc xấu, từ tốt chuyển sang xấu, từ xấu chuyển sang tốt. Đó là sự phản ánh của quẻ Phục. Khi thấy đường kinh doanh buôn bán của bạn không phát triển tốt, bạn không nên cho rằng sẽ tốt mãi mãi. Khi thấy kinh doanh của bạn không phát triển thậm chí lỗ vốn, bạn cũng không nên buồn bã, bởi nếu bạn chuyên tâm dốc sức vào công việc, thay đổi phương thức kinh doanh…sẽ làm thay đổi tình hình kinh doanh yếu kém của bạn."))
        hexagrams.add(Hexagram("000110", "QUẺ THIÊN LÔI VÔ VỌNG", R.drawable.i25, "\"Điểu Bị Long Lao\" – Tù túng buồn lo.\n" +
                "\"Vô vọng\" có nghĩa là \"không còn mong tưởng gì nữa\", không hy vọng thì buồn phiền.\n" +
                "\"Điểu bị long lao\" là chuyện chim sơn ca đi tìm mồi, không ngờ bị rơi vào lồng bẫy chim, tuy có mỏ nhọn, song cũng không thoát ra được. Kẻ gieo phải quẻ này, có điềm \"Tù túng buồn lo\".\n" +
                "Hình tượng của quẻ Vô Vọng nói:\n" +
                "Chim sa vào lồng bẫy, muốn thoát cũng không xong, vì thế chỉ còn cách tự an phận, chớ có ước muốn cao xa làm gì, chỉ phí công vô ích.\n" +
                "Lời đoán: Góp vốn bất lợi, hôn nhân bất thành, bệnh tật không khỏi, ra đi không gặp.\n" +
                "Lời bàn: Sách \"Sử ký\" của Tư Mã Thiên chép là \"Vô vọng\" (tức không còn hy vọng), mất hết hy vọng. Con người luôn nuôi hy vọng, mơ ước cuộc sống tốt đẹp hoặc thoát cảnh khó khăn, cực khổ. Cuộc đời có lúc bĩ cực, cũng có hồi thái lai. Ở cảnh tù túng nên giữ mình chờ thời \"thái lai\".\n" +
                "Lời giải: Đề phòng tai họa bất ngờ.\n" +
                "\"Vô Vọng\" tức không nói càn, làm càn. Đạo của \"Vô Vọng\" vô cùng lớn. Quẻ Vô Vọng miêu tả cảnh tai họa bất ngờ như sét đánh vô duyên vô cớ hoặc sự đụng xe xảy ra bất ngờ hay bị trượt chân ngã. Những chuyện này gọi là rủi ro. Kinh Dịch dùng cụm từ \"Thiện Hạ Lôi Hành\" (trên trời sấm sét đánh xuống) để hình dung quẻ Vô Vọng. Theo người xưa thì tiếng sấm sét là để nuôi dưỡng vạn vật, giúp vạn vật thích nghi với môi trường. Quẻ Vô Vọng khuyên người ta không được nói càn làm càn. Sách \"Sử ký\" của Tư Mã Thiên chép quẻ này là \"Vô Vọng\" (tức không còn hy vọng) vì ở cảnh tù túng như cá chậu chim lồng.\n" +
                "Luận đoán tài vận:\n" +
                "Đường tài vận của bạn có thể bị trục trặc bởi lý do không đâu. Cái họa vô vọng đến bất thình lình như sét đánh ngang tai, khiến bạn không thể đối phó được. Nhưng ở trên đời này phúc họa đều có nguyên nhân sâu xa. Nguyên nhân này không phải do tiền kiếp gây tạo ra mà do nhiều đời trước tích tụ, cũng giống như bạn đạt đến thành công một phần do công lao của bạn, nhưng phần lớn là do công sức của nhiều thế hệ tổ tiên của bạn tạo ra, bạn chỉ là người thu hoạch mà thôi."))
        hexagrams.add(Hexagram("011000", "QUẺ SƠN THIÊN ĐẠI SÚC", R.drawable.i26, "\"Trận Thế Đắc Khai\" – Không còn trở ngại.\n" +
                "\"Đại súc\" có nghĩa là \"sức chứa lớn\", vì thế có hình tượng \"thế trận được mở\".\n" +
                "\"Trận thế đắc khai\" là chuyện Quảng Thành Tử bị vây khốn trong trận Đăng hỏa, sai tướng Phan Thiên Ấn tế lễ mở trận Quần Tiên, phá tan trận Đăng Hỏa. Người gieo được quẻ này có điềm \"không còn trở ngại\".\n" +
                "Hình tượng của quẻ Đại Súc nói:\n" +
                "Buồn bã khiến mặt mày ủ rũ, việc khó luôn canh cánh bên lòng. Từ nay mở ra trận thế mới, tùy ý hoạt động không còn lo gì nữa.\n" +
                "Lời đoán: Gặp vận tốt, người đi có tin về, xuất hành đại cát, mọi sự thuận lợi.\n" +
                "Lời bàn: Đại súc là đã có đủ lực lượng, đủ sức mạnh để hành động. Phàm làm bất cứ việc gì đều phải chuẩn bị đầy đủ. Chuẩn bị đầy đủ thì thành công. Có chuẩn bị đủ các mặt thì mới triển khai công việc, bởi vì không thể làm ẩu làm bừa, dẫn đến làm hỏng, làm sai. Vì vậy, dù gieo được quẻ tốt nhưng không làm theo hướng dẫn của quẻ, không ứng nghiệm.\n" +
                "Lời giải: Đã hết trở ngại.\n" +
                "\"Súc\" có nghĩa là \"chứa\", \"để dành\", \"Đại Súc\" có nghĩa là \"để dành lớn\", \"chứa nhiều\". Kinh Dịch dùng cụm từ \"Thiên tại sơn trung\" (trời ở trong núi) để chỉ quẻ Đại Súc, ý chỉ núi còn cao hơn trời. Vì núi cao lớn như vậy, nó có thể chứa rất nhiều sinh vật. Quẻ Đại Súc muốn bảo ta rằng cần phải tích lũy tiền của, kiến thức, nhân đức. Lời tượng quẻ này có câu \"Quân tử dĩ đa thức, tiền ngôn vãng hành, dĩ súc kỳ đức\" có nghĩa người quân tử tri thức uyên bác, học vấn cao, dựa vào lý quẻ này đi đến đâu cũng được hoan nghênh, được nuôi dưỡng.\n" +
                "Thời cổ đại, mọi người đều trồng lúa, khi sức sản xuất phát triển thì một số người tách khỏi lao động chân tay làm việc trí óc. Vì vậy, lời quẻ này có câu \"Bất gia thực, cát\" tức \"không phải lao động chân tay, không cần ăn cơm nhà, tốt lành\".\n" +
                "Luận đoán tài vận:\n" +
                "Bạn đang kinh doanh buôn bán phát triển, sự nghiệp thuận lợi. Bạn càng tích lũy kiến thức kinh nghiệm phong phú bao nhiêu, công việc của bạn càng phát đạt bấy nhiêu. Điều bạn nên nhớ là phải tích lũy tiền bạc, kiến thức, kỹ thuật mới phù hợp với quẻ Đại Súc."))
        hexagrams.add(Hexagram("011110", "QUẺ SƠN LÔI DI", R.drawable.i27, "\"Vị Thủy Phỏng Hiền\" - Bĩ cực thái lai.\n" +
                "\"Di\" có nghĩa là \"nuôi dưỡng\", ăn uống là tự nuôi, vì vậy nó có hình tượng \"đến thăm người hiền ở sông Vị\".\n" +
                "\"Vị thủy phỏng hiền\" là chuyện Khương Thái Công thuở hàn vi thường ngồi câu ca 1be6n bờ sông Vị. Chu Văn Vương nghe tin, đích thân đến thăm, mời ra giúp nước. Thái Công lên xe về triều, được phong làm quốc phụ. Người gieo được quẻ này có điềm \"Bĩ cực thái lai\".\n" +
                "Lời đoán: Vị thủy phỏng hiền, đại cát đại lợi, mọi việc như ý, làm ăn gặp vận.\n" +
                "Lời bàn: Muốn phát triển phải nuôi dưỡng chí khí, tập hợp lực lượng, xây dựng căn cứ. Muốn tồn tại lâu dài phải bảo dưỡng nguyên khí, bổ sung cái thiếu, sửa chữa chỗ khuyết. Vua Văn Vương sở dĩ lập nên sự nghiệp nhà Tây Chu là nhờ ở chỗ nuôi dưỡng nhân tài, thi hành nhân đức.\n" +
                "Lời giải: Bĩ cực thái lai.\n" +
                "\"Di\" có nghĩa là \"nuôi dưỡng\", \"bảo dưỡng\". Quẻ Di liên quan đến cái miệng của chúng ta.\n" +
                "Kinh Dịch dùng cụm từ \"Sơn Lôi Di\" để nhắc nhở chúng ta: \"Quân tử dĩ thận ngôn ngữ, tiết ẩm thực\" tức quân tử dựa vào lý quẻ này, thận trọng nói năng, ăn uống tiết độ. Trên thực tế không phải chỉ nói năng ăn uống thận trọng mà mọi việc đều phải thận trọng. Chỉ cần hơi sơ suất là hỏng việc ngay. Tai họa do thiên nhiên gây ra còn có thể phòng tránh, tai họa do con người gây ra, khó có thể tránh được. Cổ nhân có câu \"Bệnh vào từ miệng, họa ra từ mồm\".\n" +
                "Luận đoán tài vận:\n" +
                "Đường tài lộc của bạn khá phát triển, bởi quẻ Di có tượng ăn uống chè chén lớn. Nhưng càng thắng lớn, càng lãi to, càng phải thận trọng. Thường tai họa hay xảy ra sau khi \"đại thắng lợi\".\n" +
                "Bạn đã qua cơn \"bĩ cực\" đang bắt đầu \"thái lai\", tuy vậy bạn vẫn phải cần thận trọng trong ăn nói, làm việc. Bạn hãy suy nghĩ cẩn thận nhất là việc đầu tư phát triển sản xuất, kinh doanh."))
        hexagrams.add(Hexagram("100001", "QUẺ TRẠCH PHONG ĐẠI QUÁ", R.drawable.i28, "\"Dạ Mộng Kim Tiền\" – Không vẫn hoàn không.\n" +
                "\"Đại quá\" có nghĩa là \"vượt mức quá nhiều\". Quá mức, quá nhiều là tai họa, vì thế nó có hình tượng của \"nằm ngủ ban đêm mơ thấy tiền bạc\".\n" +
                "\"Dạ Mộng Kim Tiền\" là chuyện kẻ luôn nghĩ đến tiền nhưng không kiếm được, đêm nằm mơ thấy tiền vàng rất nhiều, lấy được rất dễ, tỉnh dậy vẫn tay trắng. Kẻ gieo phải quẻ này có điềm \"không vẫn hoàn không\".\n" +
                "Hình tượng của quẻ Đại Quá nói:\n" +
                "Đêm nằm mơ thấy được rất nhiều vàng bạc, tỉnh dậy không thấy một chinh. Hiện chỉ nên an phận, còn tơ tưởng chỉ mệt óc nhọc lòng.\n" +
                "Lời đoán: Làm việc bất thành, cầu tài không được, hôn nhân không thành. Mọi sự bất thành, phải nhẫn nại, chớ có mơ mộng.\n" +
                "Lời bàn: Phương ngôn có câu: \"Tốt quá hóa lốp\". Việc gì quá đều có hại. Lượng đổi đến mức quá sẽ phá vỡ kết cấu nội tại của sự vật hiện tượng. Vì vậy, mọi việc đều làm có chừng có mực thì mới thành công.\n" +
                "Lời giải: Không vẫn hoàn không.\n" +
                "\"Quá\" là vượt qua giới hạn, \"đại quá\" là vượt qua giới hạn quá nhiều. Phàm cái gì cũng hỏng, vì thế quẻ này có tượng nằm mơ ban đêm thấy vàng nhưng tỉnh dậy không có một xu. Quẻ Đại Quá."))
        hexagrams.add(Hexagram("101101", "QUẺ THUẦN KHẢM", R.drawable.i29, "\"Thủy Đế Lao Nguyệt\" - Uổng công phí sức.\n" +
                "Khảm có nghĩa là \"hố\" là \"lõm\" là \"trũng\", nghĩa bong là uổng công vô ích. Vì vậy mà có hình tượng \"đáy sông mò trăng\".\n" +
                "\"Thủy Đế Lao Nguyêt\" là chuyện mặt trăng chiếu xuống đáy sông, rất đẹp. Có người đi tới, nhìn xuống sông, tưởng là châu báu, liền nhảy xuống mò, nhưng chỉ uổng công phí sức. Kẻ gieo phải quẻ này, có điềm uổng công phí sức.\n" +
                "Hình tượng của quẻ Khảm nói: Một vầng trăng sáng chiếu xuống sông / Chỉ thấy bóng mình chẳng thấy tông / Ngu nhân tưởng ngọc liền nhảy xuống / Đáy sông mò nguyệt, chỉ uổng công /\n" +
                "Quẻ Khảm là quẻ thuần Thủy, ở trên là nước, ở dưới cũng là nước. Trong mắt người xưa, nạn lụt là thiên tai, nguy hiểm, chẳng khác gì động đất. Trong kinh dịch luôn chú trọng tính nguy hiểm của quẻ Khảm. Khuyên \"biết nguy hiểm thì không còn là nguy hiểm\", hơn nửa còn dụng nó để phòng thủ thành trì (đào hào nước xung quanh thành để phòng thủ) Thánh nhân gọi quẻ này là quẻ tập Khảm, vì thấy nó hai lần hiểm. Trong hiểm có hiểm. Nên nhắc chúng ta phải hết sức cẩn thận., cảnh giác, đề phòng nguy hiểm, năm xung tháng hạn thì coi như thoát hiểm.\n" +
                "Gieo quẻ này đường tài lộc không hanh thông, đứng trước nguy cơ khó khăn, khủng hoảng. Nên duy trì kinh doanh mức bình thường, nên chú ý việc, sự liên quan đến sông nước. Cổ ngử có câu: Của mất coi như không mất gì / Sức khỏe mất là mất mát lớn / Đức tin mất là mất tất cả /."))
        hexagrams.add(Hexagram("010010", "QUẺ THUẦN LY", R.drawable.i30, "\"Thiên Quan Tứ Phúc\" \"Phát Phúc Sinh tài\".\n" +
                "Ly có nghĩa là \"bám\", âm bám vào dương, vì vậy nó có hình tượng \"thần phúc lộc ban phúc\". Thiên quan tứ phúc được coi là thần phúc lộc, ngự trong vận mệnh người nào, người đó gặp hung hóa cát, biến họa thành phúc, mọi việc như ý. Người gieo được quẻ này có điềm phát phúc sinh tài.\n" +
                "Hình tượng của quẻ Ly: Thiên quan chiếu mạng, chủ lộc nhiều, buôn bán có lợi lớn, làm việc gì cũng có lợi.\n" +
                "Lời đoán: Mọi việc hanh thông, ra ngoài vui vẻ, tai qua nạn khỏi, bệnh tật tiêu tan.\n" +
                "Quẻ Ly là quẻ Thuần Hỏa. Kinh dịch có lời: Ly giả, lệ dã, nghĩa rằng: Quẻ Ly, đẹp thay! Thời cổ, ba chữ Ly (chia ly), chữ Lệ (hoa lệ), chữ Lê (trong từ buổi bình minh) đều có nghĩa là quang minh (sang sủa). Ba chữ này phát âm hoàn toàn giống nhau, có thể dùng thay nhau trong mọi trường hợp. Ví sao chữ Ly và chữ Lệ lại chú giải thay nhau? Điều này quan hệ đến lửa, vì lửa là đại biểu cho sự sáng và nhiệt tình. Ly có nghĩa là bám, âm bám vào dương, nên có tượng thiên nhiên ban phúc."))
        hexagrams.add(Hexagram("100011", "QUẺ TRẠCH SƠN HÀM", R.drawable.i31, "\" Manh Nha Xuất Thổ\" \"Thời vận đã đến\"\n" +
                "Hàm có nghĩa là giao cảm, thiên địa giao cảm, vạn vật sinh, vì thế có hình tượng: Mầm cây nhô lên mặt đất. Manh Nha Xuất Thổ là chuyện có cây trong đất, đến lúc giao mùa thu - đông, mục đồng đốt cỏ, mầm cỏ đều bị vùi lấp. Khi mùa xuân về, cỏ cây lại hồi sinh, mầm cỏ đội đất mọc lên. Kẻ giao được quẻ này có điềm \"Thời vận đã đến\".\n" +
                "Hình tượng của quẻ Hàm: Vận đen hoàng kim mất / Vận đỏ lộc tiến vào / Vận phát khiến lòng dạ vui mừng / tâm hồn rộng mở /\n" +
                "Lời đoán: Mưu sự tất thành, xuất hành có lợi / Của mất lại về / Bệnh tật tiêu tan.\n" +
                "Hàm có nghĩa là giao cảm, cảm thụ, cảm hứng, Kinh dịch dung cụm từ: Thiên Thượng Hữu Trạch\" để miêu tả quẻ này. Hồ trên Núi (Đoài trên Cấn) Vì sao có chuyện này? Núi cao, áp suất không khí thấp, nước đóng băng mùa đông. Khi mùa xuân về, nước tan trên đỉnh núi chảy xuống khe núi tạo thành hồ. Những hồ này đầu tiên cảm nhận được không khí mùa xuân. Mọi vật đều tác động đến nhau qua cảm thụ mà biết. Thiên địa giao cảm, vạn vật mới sinh sôi. Quẻ này lợi xuất hành, lợi về thành thật, thuận hòa. Chỉ có chí thành mới cảm hóa được lòng người."))
        hexagrams.add(Hexagram("110001", "QUẺ LÔI PHONG HẰNG", R.drawable.i32, "\" Ngư Lai Chàng Võng\" \"Vạn sự như ý\"\n" +
                "Hằng có nghĩa là thường xuyên và lâu dài, nên nó có hình tượng cá va vào lưỡi.\n" +
                "Ngư lai chàng võng là chuyện một ông lão đánh cá đến bờ sông quăng lưới. Cá tự lao vào lưới. Ông lão đánh cá đánh được nhiều cá, trong lòng vô cùng phấn khởi. Người gieo được quẻ này có điềm \"Vạn sự như ý\".\n" +
                "Hình tượng của quẻ Hằng: Ngư ông đánh cá gặp vận đỏ, cá tự chui đầu vào lưới.\n" +
                "Lời thơ của quẻ: Cá tự vào lưới, thật là may / Bệnh tật tiêu tan, người đi về / Giao dịch xuất hành đều được lợi. / Mưu sự tất thành, mọi việc thông. /\n" +
                "Lời đoán: Xuất hành co lợi. Bệnh tật tự khỏi. Cãi cọ tự mất. Kinh doanh buôn bán thuận lợi.\n" +
                "Hằng có nghĩa là lâu dài, mãi mãi. Kinh dịch dùng câu: \"Quân tử dĩ lập bất dịch phương\", (Quân tử dựa lý quẻ này xác lập đạo - lý tưởng - không bao giờ thay đổi lập trường để chỉ quẻ Hằng. Hằng là đạo trời đất. Đạo trời đất là âm dương giao hòa, trường tồn. Quân tử xác định đạo này mới có thể trường cửu. Đạo trường cửu tức là âm phải theo dương. Quân tử giữ đạo trung hiếu, thực hành nhân, nghĩa lễ trí tín, tiểu nhân không như vậy. Đạo của tiểu nhân là đạo tham lam, đố kỵ, hại người. Quân tử dù chết cũng không thay đổi lập trường, không tham lam, không độc ác, không hại người. Nhưng quẻ Hằng cũng có nhược điểm. Đó là cố chấp, bảo thủ, ngoan cố, cứng nhắc, không thích ứng trào lưu, tự cao tự đại, không nhạy bén.\n" +
                "Đạo của quẻ Hằng dương phải nhường âm, âm phải theo dương thì mới lâu dài. Hòa thuận là cái gốc của thành công. Cổ nhân có câu \"hỏa khí sinh tài\" , bạn nên giữ hòa khí với bạn hợp tác, với nhân viên mới đúng với đạo lâu dài của quẻ Hằng.\n" +
                "Gieo được quẻ Hằng, tài vận rất tốt, có thể lâu dài, ổn định. Bạn đã có thu nhập ổn định., song cần chú ý thuận theo trào lưu, thay đổi phương thức kinh doanh phù hợp."))
        hexagrams.add(Hexagram("000011", "QUẺ THIÊN SƠN ĐỘN", R.drawable.i33, "\" Nông Vân tế Nhật \", \"Mưu sự bất thành\"\n" +
                "Thiên / Sơn = Độn. Nghĩa quẻ: \"Nồng Vân Tế Nhật\" (Mưu sự bất thành). Độn tức là tránh, là trốn, tượng là mây dầy che trời.\n" +
                "Mặt trời đang chiếu sáng, bỗng có một đám mây đen ùn ùn kéo đến, ánh sáng bị che lấp, mọi việc đang bình thường bỗng rối loạn, hoảng hốt, kẻ nhanh tay cướp, biến, kẻ nhanh chân vừa chạy vừa vơ vét, mọi việc hổn loạn, không còn phép tắc, không ai đủ tư cách làm chủ được tình hình bảo với bầy đàn là mây sẽ tan và trời sẽ lại sáng.Quẻ này, đoán rằng: Mất của khó thấy, giao dịch khó khăn, góp vốn bất lợi, mọi sự bất thành, nhân tình thế thái hung họa khôn lường.\n" +
                "Dịch học dùng cụm từ \"Thiên hạ hữu sơn\" (dưới trời có núi) để miêu tả quẻ Độn. Lời kinh giảng thêm: Quân tử dựa lý quẻ này, xa bọn tiểu nhân, không cần độc ác, chỉ cần nghiêm khắc là được. (Độn, quân tử di viễn tiểu nhân, bất ác nhi nghiêm). Đạo của quẻ Độn là né tránh, bỏ đi, rút lui. Đối với kẻ tiểu nhân, nếu dùng thủ đoạn độc ác, dữ tợn, cáu gắt, chúng sẽ oán thù. Khi khí âm đang thịnh, khí dương phải suy. Lúc đó, quân tử phải biết rút lui."))
        hexagrams.add(Hexagram("110000", "QUẺ LÔI THIÊN ĐẠI TRÁNG", R.drawable.i34, "\" Công sư đắc mộc\", (Vận khí sắp lên)\n" +
                "Đại tráng có nghĩa là thịnh vượng, công việc hưng thịnh, vì vậy có hình tượng \"người thơ mộc được gỗ\".\n" +
                "Người gieo được quẻ này là điềm \"Vận khí sắp đến\".\n" +
                "Giảng: Tráng có nghĩa là khỏe mạnh, Đại Tráng có nghĩa là rất khỏe mạnh. Khỏe mạnh hàm nghĩa thịnh vượng. Song, cũng đề phòng \"tốt quá hóa lốp\" . Dịch học có câu: Đại tráng, quân tử dĩ phi lễ vật lý. (Quẻ Đại tráng chỉ người quân tử dựa lý quẻ này, không làm những chuyện vô lễ). Của phi nghĩa không tham. Việc phi nghĩa không làm. Tiền phi nghĩa không lấy. Chuyện phi nghĩa không nghe. Quan hệ phi nghĩa không giao lưu.\n" +
                "Quẻ Đại Tráng mang nhiều yếu tố xung đột và trái nghịch. Thánh nhân dùng quẻ này để răn dậy chúng ta cố tránh xung đột, không làm điều sai, điều phi nghĩa, điều xấu hổ. Của cải tiền bạc có bền hay không phụ thuộc vào việc kiếm được bằng con đường chính đáng. \"Tiền phi nghĩa dù làm nhà ở cũng không ở được\"."))
        hexagrams.add(Hexagram("010111", "QUẺ HỎA ĐỊA TẤN", R.drawable.i35, "\" Sư Địa Đắc Kim\", (Vận đỏ sắp đến)\n" +
                "Tấn có nghĩa là tiến. Trước tiến lên, sau có ích. Vì vậy có hình tượng \"cuốc đất được vàng\". Sư địa đắc kim là chuyện một người nông dân cuốc đất, đào bờ, bỗng nhiên cuốc được một cục vàng. Người gieo được quẻ này có điềm \"vận đỏ sắp đến\". Tấn có nghĩa là lên chức, thăng cấp, đồng thời cũng có nghĩa là gắng vươn lên, tích cực tiến lên. Dịch học dùng cụm từ \"Minh xuất địa thượng\" (Mắt trời mọc trên đất) để chỉ quẻ Tấn. Mặt trời mọc trên đất, càng lên cao càng sáng, đó là cái ý tiến lên.\n" +
                "Dịch học dùng quẻ tấn nhắc nhở chúng ta muốn tiến bộ, phải như mặt trời mọc, ra sức leo lên cao. Cho nên dịch nói \"Tấn tiến dã\" (quẻ tấn có nghĩa là tiến vậy) . Lời kinh còn khuyên: Hỏa tại địa thượng / Tấn, quân tử dĩ tự chiêu minh đức\" (Lửa ở trên đất là quẻ Tấn. Người quân tử dựa lý quẻ này tự làm sáng chữ \"đức\" của mình.\n" +
                "Quẻ Tấn là quẻ chủ động, tích cực, vì vậy chớ nên do dự, nhanh chóng thực hiện kế hoạch đã đề ra."))
        hexagrams.add(Hexagram("111010", "QUẺ ĐỊA HỎA MINH DI", R.drawable.i36, "\" Quá Hà sách kiều\" - Vô cùng khó khăn.\n" +
                "Minh Di có nghĩa là \"nhìn thấy kẻ bị thương\" (Minh là nhìn thấy / Di là kẻ bị thương), vì thế có hình tượng qua sông phá cầu.\n" +
                "\" Quá Hà sách kiều\" là chuyện một người định qua sông, nhưng không muốn người khác đi trước mình, không muốn người khác qua sông nên tranh đi trước, qua sông liền phá cầu, khiến cho người không qua sông được. Kẻ gieo được quẻ này có điềm khó khăn, nếu không muốn nói là vô cùng khó khăn.\n" +
                "Gieo phải quẻ này chớ nên manh động. Đường tài lộc của bạn đang bị cản trở. Minh Di là bi thương nên tài lộc của bạn có thể bị hao tổn trầm trọng. Đường kinh doanh buôn bán trì trệ, tối tăm. Không nên đầu tư kinh doanh phiêu lưu, liều lĩnh. Tốt nhất nên tu thân chờ cho thời Minh Di này qua đi, phát triển kinh doanh cũng chưa muộn. Bạn cần hết sức đề phòng kẻ tiểu nhân hèn hạ, nhân cơ hội thế đạo tối tăm làm hại."))
        hexagrams.add(Hexagram("001010", "QUẺ PHONG HỎA GIA NHÂN", R.drawable.i37, "\" Kinh lí quan hoa\" - Theo đuổi ảo ảnh.\n" +
                "\" Gia nhân\" có nghĩa là người trong nhà. Ở đâu cũng vẫn là người một nhà, vì vậy nó có hình tượng \"xem hoa trong gương\".\n" +
                "Kính lí quan hoa, là chuyện một người soi gương chải đầu, nhìn thấy hoa tươi trong gương rất đẹp, trong lòng muốn lấy nhưng không được. Người gieo phải quẻ này là điềm theo đuổi ảo ảnh. Bông hoa nở, nhìn trong gương rất đẹp, nhưng không thể hái được. Khuyên, nên để yên hoa trong gương, mọi việc không thể sắp xếp khéo léo. Gia cảnh nghèo hèn, nhiều éo le mà đòi theo đổi công chúa hoàng tử thì e là không thể, hoang đường.\n" +
                "Gia nhân là người nhà. Đạo gia nhân gốc ở người nữ. tề gia nội trợ. Tề gia là cai quản việc nhà, không để con cái nhàn rỗi, phòng ngừa ngay từ khi nhỏ, uốn nắn ngay từ khi bé. Người nhà khuôn phép thì gia đạo hay. Tề gia phải cư xử nghiêm túc, công bằng, công minh, gia đình phải yên ổn, thuận hòa. Gốc của tề gia vẫn là tu thân, giữ cho mình, chân chính, chân chính trước mắt mọi người. Mình sống đạo đức, mọi người khâm phục. Không thuyết phục được người nhà, làm sao thuyết phục được người trong thiên hạ.\n" +
                "Người nhà của bạn, đóng vai trò quan trọng trong đường tài lộc của bạn. Chính họ là nhân tố tích cực để bạn có thể phát triển và mở rộng kinh doanh. Gieo được quẻ này có nghỉa là bạn phải dựa vào người nhà. Họ không những bỏ công, bỏ sức, mà còn bỏ vốn giúp bạn kinh doanh buôn bán. Chỉ khi sự nghiệp của bạn là sự nghiệp của chính họ, sự nghiệp kinh doanh của bạn mới thành công. Bạn hãy giữ cho gia đình hòa thuận, yên vui, hạnh phúc."))
        hexagrams.add(Hexagram("010100", "QUẺ HỎA TRẠCH KHUÊ", R.drawable.i38, "\" Phán trư mại dương\" - Long đong, lận đận.\n" +
                "\"Khuê\" có nghĩa là quái dị, trái với đạo lý thông thường. Tính nết quái dị, ngược với đạo lý thông thường. cho nên có hình tượng là buôn lợn, bán dê.\n" +
                "\" Buôn dê, bán lợn\" là chuyện người kia buôn dê thì thịt lợn bán chạy, buôn lợn thì thịt dê bán chạy, buôn cả lợn, dê thì lại bị cấm giết mổ. Gieo được quẻ này vất vả, long đong lận đận là vậy.\n" +
                "\" Khuê\" tức là trái ngược, hai người quay lưng vào nhau, không thèm quan hệ với nhau. Dịch học dùng cụm từ: thượng hỏa, hạ trạch (trên lửa, dưới đầm) đề chỉ quẻ này. Nước lửa bất tương, lửa cháy lên trên, nước thấm xuống dưới. Những kẻ khác nhau, muốn hợp tác với nhau phải chịu đựng, nhường nhịn nhau., coi trọng đại cục, bỏ tiểu tiết mới có thể lâu dài được.\n" +
                "Gieo được quẻ này phải hết sức kiềm chế tính nóng nảy của mình. Quẻ này tính xung đột, bất như ý rất mạnh. Cổ nhân có câu \"hòa khí sinh tài\" giữ được hòa khí tiền của mới phát triển."))
        hexagrams.add(Hexagram("101011", "QUẺ THỦY SƠN KIỂN", R.drawable.i39, "Vũ Tuyết Mãn Đồ - Mưu sự không đúng. Kiển có nghĩa là khó, chân không thể bước lên, đi đường gian khó, vì vậy có hình tượng là: Bùn, tuyết đầy đường. Người gieo được quẻ này có điềm \"mưu sự không đúng\".\n" +
                "Hình tượng của quẻ Kiền: Trời mưa to, tuyết đầy đường, người đi vất vả, khó tiến, dây dưa, mất sức, việc không ưng ý, buồn phiến.\n" +
                "Lời đoán: Đi không đến nơi, kiện cáo lôi thôi, cầu danh, cầu lợi không được.\n" +
                "Lời bàn: Có việc tiến hành thuận từ khi mở đầu cho tới kết thúc, có việc vừa mở đầu đã gặp trở ngại, khó khăn. Việc bất lợi phải biết dừng lại, tìm nguyên nhân gây ra khó khăn mà quyết định chờ đợi hoặc khắc phục nguyên nhân để tiếp tục công việc.\n" +
                "Lời giải: Mưu sự không đúng.\n" +
                "Kinh dịch dùng cụm từ \"Trên núi có nước\" để chỉ quẻ Kiển. Trên núi có suối, có thác, không thể trèo lên được. Cho nên Kinh dịch giải nghĩa: Kiến hiểm nhi năng chỉ, tri hỹ tai (Thấy nguy hiểm ở phía trước mà biết dừng, khôn vậy thay). Trí tuệ lớn nhất của con người là chỗ kịp thời phát hiện ra nguy hiểm, kịp thời ngừng lại để tránh nguy hiểm. Kinh dịch nói rất cụ thể: Kiển là nạn về chân, nguy hiểm ở Đông Bắc. Thấy có nguy hiểm phải tự xét mình có làm điều lầm lỗi? / Tự xét mình, mới sáng suốt, mới tránh được tai họa.\n" +
                "Luận đoán tài vận: Gieo quẻ Kiển, chỉ cần không phát triển, không mở rộng kinh doanh, hùn hạp là được. Nếu cố tình không nghe, sẽ chuốc lấy thất bại. Bạn chỉ tạm dừng thôi chứ không phải dừng mãi mãi. Trong tình huống cụ thể, bạn có thể dụng giải pháp đi đường vòng. Quẻ Kiển còn khuyên không liều lĩnh lao đầu vào các lĩnh vực mới lạ, chưa biết, lĩnh vực bấp bênh, không nên hợp tác với người quá xem trọng đồng tiền và người thiếu tin cậy."))
        hexagrams.add(Hexagram("110101", "QUẺ LÔI THỦY GIẢI", R.drawable.i40, "Ngũ Quan Thoát nạn - May mắn thoát nạn.\n" +
                "Giải có nghĩa là khó khăn, tiêu tan, gặp khó, khó khăn không còn, vì thế có hình tượng thoát nạn ở ngũ quan.\n" +
                "Hình tượng của quẻ Giải: Vượt cửa ải thật gian lao, nguy hiểm. Gặp nan có người giải cứu, có thể tự do hành động.\n" +
                "Lời đoán: Hôn nhân rất tốt, người đi sớm trở về, mưu sự tất thành, mọi việc may mắn.\n" +
                "Lời bàn: May mắn là sự việc ngẫu nhiên hoặc trùng hợp dẫn đến\n" +
                "kết quả tốt đẹp cho người gặp may. Cũng co người gặp may nhiều lần trong đời, lại có kẻ chẳng bao giờ gặp may.Kẻ gặp may phải biết cảm ơn người giúp thoát tai họa. Suy cho cùng vận may là vận số của từng người, từng gia đình.\n" +
                "Lời giải: May mắn.\n" +
                "Giải có nghĩa là hòa giải, giải thoát. Kinh dịch dùng cụm từ \"Lôi Vũ Tác\" để chỉ quẻ Giải. Mùa hè, thời tiết oi bức khiến mọi người vô cùng khó chịu, bỗng sấm chớp đùng đùng đổ xuống một trận mưa, khiến mọi người hể hả, dễ chịu. Đó là biểu hiện của quẻ Giải. Bạn gặp nạn có người giải cứu, gặp khó có người giúp đỡ. Lời kinh có câu: Lôi Vũ tác, giải, quân tử đi xá quá, hưu tội / (Sấm mưa nổi lên là quẻ Giải, quân tử dựa lý quẻ này có thể tha cho kẻ có tội). Quẻ này chú trọng đến việc vô hiệu hóa kẻ tiểu nhân, chớ để chúng dụng việc công trả thù cá nhân. Kẻ tiểu nhân là gốc của mọi tai họa, nếu trừ được chúng là tốt nhất.\n" +
                "Luận giải tài vận:\n" +
                "Gieo được quẻ này rất may mắn, đường tài lộc đang tiến triển tốt, cần đề phòng tiền tài bị thất thoát. Nếu bạn thực hành theo quẻ Giải, tha lỗi cho người khác, xử sự khoan dung, đại lượng, đường tài lộc sẽ càng hanh thông, tiến triển.Nếu bạn đang gặp khó khăn, gieo được quẻ này, tốt lắm. Bạn sẽ gặp quí nhân giúp bạn vượt qua khó khăn."))
        hexagrams.add(Hexagram("011100", "QUẺ SƠN TRẠCH TỔN", R.drawable.i41, "Thôi Xa Điếu Nhĩ - Uổng phí công sức.\n" +
                "Tổn có nghĩa là giảm, hao tán, tổn nội ích ngoại, vì thế có hình tượng đẩy xe rơi chốt.\n" +
                "(Thôi xa điếu nhĩ - là chuyện một người đẩy xe xuống dốc bờ sông, khi đến nửa chừng bỗng nhiên hai chốt bánh xe long ra, xe lăn xuống sông. Gieo được quẻ này có điềm Uổng phí công sức.) Đẩy xe rơi chốt, xe không chạy, trong lòng mong muốn nhưng không đủ sức lực. Quân tử gieo phải quẻ này cho dù không tai họa cũng rơi vào cảnh khốn cùng.\n" +
                "Lời đoán: Thời vận chưa đến, chớ có làm bừa, thời thế thay đổi, tự nhiên thành công.\n" +
                "Lời bàn: Thời xưa, xe đang đi mà hỏng là có chuyện. Xe tốt mà hỏng là vận số chưa thông, cần phải chờ đợi, giống như điều kiện chưa đủ mà làm thì thất bại.\n" +
                "Lời giải: Uổng sức phí công.\n" +
                "Tổn có nghĩa là hao tổn, tổn thất. Nhưng quẻ Tổn không có nghĩa tổn thất mà giải thích là Tự ràng buộc / Tự kiềm chế. Tự kiềm chế tính nóng, dục vọng, ý nghĩ sai lầm của mình, có lợi cho mình và mọi người. Kinh dịch dùng cụm từ Sơn Hạ Hữu Trạch (dưới núi có đầm) để miêu tả quẻ Tổn. Đào hồ đắp núi có nghĩa là Tổn dưới / Ích trên. Lấy của người dưới cho kẻ trên là quẻ Tổn. Lấy ở trên đắp ở dưới là đạo bền gốc (quẻ ích), lấy dưới đắp trên có nguy cơ sụp đổ (quẻ Tổn). Người trên bớt chút của mình cho kẻ dưới là \"làm ơn mà không uổng công phí sức\". Nếu lấy của kẻ dưới thật uổng công phí sức.\n" +
                "Luận đoán tài vận:\n" +
                "Gieo quẻ Tổn tuy xấu, nhưng vẫn có cách hóa giải. Vấn đề ở chỗ có năng lực tự kiềm chế, tự ràng buộc, tự giáo dục (tu thân). Nếu biết tu thân mọi sự tất cát vượng. Những người hồ đồ, nóng nảy thật khó lòng kinh doanh buôn bán. Nhưng kẻ tham lam, ích kỷ khó thành tựu đường công, quan. Quẻ này cũng khuyên nên hết sức đề phòng tiểu nhân chơi xấu, hãm hại."))
        hexagrams.add(Hexagram("001110", "QUẺ PHONG LÔI ÍCH", R.drawable.i42, "Khô Mộc Khai Hoa - Bĩ cực vinh lai\n" +
                "Ích có nghĩa là tăng lợi ích, có ích không tổn hao, vì vậy nó có hình tượng cây khô nở hoa. Gieo được quẻ này là điềm Bĩ cực vinh lai.\n" +
                "Hình tượng của quẻ Ích: Thời thế thay đổi, vận cát phát, cây khô nhiều năm lại nở hoa, cành lá tươi tốt. Ai cũng ngợi khen.\n" +
                "Lời đoán của quẻ: Giao dịch tất thành, kiên cáo có lý, của mất lại về, hôn nhân hòa hợp, buôn bán hưng thịnh, bệnh tật tan biến, cãi cọ tự tan.\n" +
                "Lời bàn; Khô mộc khai hoa là điển tích trong sách \"Tục Bác Vật Chi\" kể về sự cầu xin bất tử của người tu tiên kéo dài 28 năm trước cây khô. Cây khô nở hoa ông hái ăn rồi trở thành tiên.\n" +
                "Lời giải: Bĩ cực thái lai.\n" +
                "Ích có nghĩa là tăng lợi. ích là bớt trên cho dưới, mọi người vui vẻ. Đạo của Ích thật quang minh chính đại. Song Kinh dịch lại nói: Ích giả, Tổn giã (gieo phải quẻ Ích, hao tổn thay!). Ích rõ ràng là lợi ích, vì sao lại biến thành hao tổn? Ích là tăng lên, Tổn là hao đi. Lời Kinh dạy: Tự Ích, tổn / có nghĩa là tham lam vơ vét cho riêng mình, tưởng là lợi ích, song thật sự là tổn thất. Nếu biết hy sinh, bớt ích kỷ, phụng sự vị tha, muốn lấy thì phải cho trước, muốn người giúp thì trước hết phải giúp người đã.\n" +
                "Luận đoán tài vận: Tài vận tốt xấu hoàn toàn phụ thuộc vào việc thực hiện\" Tự tổn giả / nhân tất ích giả\". Quan tâm đến lợi ích của người khác, người khác sẽ cẩn bạn, giúp bạn. Khi mọi người đã giúp tất tiền bạc danh vọng tới tự nhiên, bạn từ chối cũng không được. Cát tường của Ích là vậy."))
        hexagrams.add(Hexagram("100000", "QUẺ TRẠCH THIÊN QUẢI", R.drawable.i43, "\" Du Phong Thoát Võng\" (Gặp hung hóa cát).\n" +
                "Quải có nghĩa là quyết (kiên quyết), cương quyết mạnh mẽ mà vui vẻ, vì vậy có hình tượng: Ong thoát khỏi lưới. Tích rằng: có một đàn ong bay qua cây liễu, bị tơ nhện cuốn chân, may có gió to thổi, tơ nhện tung, ong thoát nạn. Nên, gieo được quẻ này có điềm gặp hung hóa cát.\n" +
                "Thơ đoán quẻ: Ong thoát lưới tơ thật rất may / Cầu tài, cầu lộc đến được ngay / Hôn nhân hòa hợp, bệnh tật hết / Phú quý vinh hoa, vận vào tay. / Gieo được quẻ này: kiện tụng không còn, bệnh tật tiêu tan, phúc lộc dồi dào, phú quí vinh hoa, mọi sự như ý.\n" +
                "Luận đoán tài vận: Gieo được quẻ này, tài vận hanh thông. Vậy hanh thông thế nào? Hiện đang đứng trước vấn đề phải quyết định. Không nên tham lam, phải cẩn trọng cân nhắc, không thể dụng pháp được ăn cả, ngã về không. Quẻ Quải nêu rõ: Tiên tổn hậu ích, phải biết bỏ xe để bảo vệ tướng. Luôn đề phòng tiểu nhân ở trên cao hãm hại. Hồ ở trên trời là thế, trứng treo đầu đẳng cũng như nước lũ trên cao, tạo nguy cơ đê vỡ. Quyết định phá đoạn đê phân lũ là cần kíp, bảo vệ an toàn vùng xung yếu."))
        hexagrams.add(Hexagram("000001", "QUẺ THIÊN PHONG CẤU", R.drawable.i44, "\" Tha hương ngộ hữu\" - Thời vận đã đến.\n" +
                "\"Cấu\" có nghĩa là không hẹn mà gặp / có hình tượng gặp bạn quê người. Tha hương ngộ hữu là chuyện một người bạn khốn khó ở đất người, không có người thân, ngẫu nhiên gặp bạn thân ở đất khách, vô cùng đắc ý. Người gieo được quẻ này, có điềm Thời vận đã đến.\n" +
                "Lời đoán của quẻ Cấu: Giao dịch thành công, kiện tụng có lý, của mất lại về, lộc tài đưa đến, bệnh tật tiêu tan.\n" +
                "Có nếm trải cảnh khốn cùng ở nơi đất khách quê người, mới hiểu được giá trị của tình bạn. Không có bạn thì không ai giúp lúc khó khăn. Có tình bạn còn hơn ruột thịt, đó là tình tri kỷ. Cần biết luân lý tình bạn và nuôi dương luân lý ấy.\n" +
                "Nhấn mạnh: / Cấu, nữ tráng, vật dụng thủ nữ / Cấu là gặp gỡ bất ngờ, người nữ mạnh, chớ lấy người nữ ấy. Thiên thuộc cha, phong thuộc con gái trưởng, nếu cố gặp gỡ bất ngờ sẽ thành loạn luân.\n" +
                "Gieo được quẻ này: gặp cát tường bất ngờ, nhưng không có hậu, phải đề phòng tiểu nhân, bất ngờ hãm hại mà tiêu tan sự nghiệp. Bạn bẻ (tiểu nhân) mà lừa phản, hãm hại thì tình trạng lâm vào cảnh giở khóc giở cười, chẳng khác cảnh loạn luận nhấn mạnh ở trên."))
        hexagrams.add(Hexagram("100111", "QUẺ TRẠCH ĐỊA TỤY", R.drawable.i45, "Lí Ngư biến Long - Cá chép hóa rồng - Rồng bay trên trời.\n" +
                "Tụy có nghĩa là Tụ (tụ họp), vạn vật tụ hợp, vì vậy có hình tượng cá chép hóa rồng.\n" +
                "Tích xưa: Cá chép sợ va vào lưỡi câu, nên đến Long môn mới tung người vọt qua, thân hóa trăm con rồng. Người gieo được quẻ này, điềm tốt, như bay trên trời.\n" +
                "Lời đoán: Hỷ sự liên tiếp, cầu tài như ý, kinh doanh thuận lợi, bệnh tật tiêu tan, hôn nhân hòa hợp, phú quý vinh hoa.\n" +
                "Tụy / hanh / vương cách hữu miếu (Quẻ Tụy thông, vua đến lễ ở miếu) ý rằng: Người bề trên đến lễ ở miếu, nơi tập trung rất đông con cháu, dòng họ, người dưới. Vì thế bậc trên phải có đức, bậc dưới phải nghe lời.\n" +
                "Gieo được quẻ này, đường tài quan rất tốt, chưa ưng ý sẽ được ưng ý toại lòng, nhiều cơ hội kiếm tiền ở chỗ đông người (tụ) rất ích lợi cho việc hoạt động đoàn thể, thiện nguyện. Tuy nhiên mọi việc nghĩ, việc muốn, việc làm phải lấy thuận lý làm trọng mới được hưởng phúc lộc lâu dài."))
        hexagrams.add(Hexagram("111001", "QUẺ ĐỊA PHONG THĂNG", R.drawable.i46, "Chỉ Nhật Cao Thăng - Phát tài, phát lộc.\n" +
                "Thăng có nghĩa là lên, là tiến, là tiến lên như trèo lên từng bậc, vì vậy có hình tượng là đợi ngày lên chức.\n" +
                "Chỉ Nhật Cao Thăng / tích rằng: có một kẻ làm quan, đêm mơ thấy mặt trời đỏ mọc ở phương đông, tỉnh dập đã thấy có thánh chỉ thăng chứ, lên ba bậc.\n" +
                "Lời đoán: Cầu tài thành công, mưu sự tất thành, người đi xa, của mất lại về, gia đình sum vầy vui vẻ, chức vụ lên cao, thi cử đỗ đạt thành tựu. Có người nâng đỡ, có dịp trổ tài, thăng quan tiến chức chỉ là vấn đề thời gian.\n" +
                "Lưu ý: Đường tài quan rất tốt, nhưng đặc biệt không được sốt ruột, tham lam, làm mọi cách nhanh chóng cho cây ra hoa kết trái, cái đó bảo là dục tốc bất đạt, trái hái non không thể chín. Phải tuân theo quy trình phát triển, quy trình sinh / dưỡng / tự trọng của mộc.\n" +
                "Kỹ lưỡng: Địa trung sinh mộc / Thăng / Quân tử dĩ thuận đức / Tích tiểu dĩ cao đại.(Cây sinh ra từ trong đất, là quẻ Thăng, quân tử dựa lý quẻ này làm việc nhân đức, tích tiểu để thành đại, lên cao). Thuận theo đức thì thịnh. Không nên vội vàng, đốt cháy giai đoạn. Cây lớn từ từ, một ngày cao lên bao nhiêu là do quy luật sinh trưởng quyết định, không thể tác động cơ học để cho cây lớn nhanh kiểu \"kéo mạ cho lớn\" được."))
        hexagrams.add(Hexagram("100101", "QUẺ TRẠCH THỦY KHỔN", R.drawable.i47, "Toát Thê Trừu Căn - Tình trạng bất ổn. Khổn (khốn) nghĩa là khốn đốn / không thể phấn chấn / không thể thoát ra cảnh bị sa lầy, nên có hình tượng bẫy chim, đặt thang nhưng lại rút cọc. Toát thê trừu căn là chuyện hai người bàn nhau bắt chim sẻ, đã đặt thang rồi, song lại rút cọc đi, trong lòng hoảng hốt không yên. Kẻ gieo được quẻ này trong lòng bất ổn.\n" +
                "Lời đoán: Cẩn thận hợp tác làm ăn với tiểu nhân, thận trọng với kẻ hẹp hòi. Nếu không dễ bị kẻ tiểu nhân làm cho khốn đốn.\n" +
                "Lời bàn: Qua việc làm mới biết kẻ hay, người dở. Kẻ hay làm ăn trọng chữ tín, còn người dở làm ẩu, làm bừa, làm qua quýt cốt cho xong.\n" +
                "Đoài quẻ âm lại ở trên Khảm quẻ dương, âm bao vây dương, nước ở dưới đầm ở trên làm sao nước chảy vào đầm, bế tắc, trì trệ, khốn khó là vậy.Thân tuy cao thượng, đạo thì khốn đốn, dù có nói cũng chẳng ai tin, vì thế Kinh dịch mới nói Hữu Khổn Bất Tín. Thánh nhân mượn quẻ Khổn nhắc nhở chúng ta biết đang ở thời khốn khó, có nói đúng cũng chẳng ai tin điều mình nói. Tốt nhất là nên im lặng, vì càng nói càng khốn cùng, càng cố thoát ra khỏi cảnh khốn khó càng khốn khó. Chỉ có thời gian mới giải thoát được cảnh khốn khó.\n" +
                "Gieo phải quẻ Khổn, tài vận không hay, phải có giải pháp vượt khổn, tay trắng khởi lại nghiệp."))
        hexagrams.add(Hexagram("101001", "QUẺ THỦY PHONG TỈNH", R.drawable.i48, "Khô Tỉnh Sinh Tuyền - Vận tốt đã đến. Tỉnh có nghĩa là huyệt thông (lỗ thông), nước phun từ giếng ra, vì vậy mới có hình tượng giếng khô phun nước. Khô Tỉnh Sinh Tuyền, chuyện một cái giếng không có nước lâu rồi, không ngờ gặp cơn mưa to, nước từ trong lòng đất phun ra như thác, nước giếng đầy tràn. Kẻ gieo được quẻ này có điềm Vận Tốt Đã Đến.\n" +
                "Đạo củ quẻ Tỉnh (giếng): Uống mãi không cạn / Vơi lại đầy / Đầy không tràn.\n" +
                "Lời bàn: Tinh thần phấn chấn, phúc lộc đều tăng, thanh danh nổi tiếng, vạn sự hanh thông. Tuy nhiên, vận tốt đã đến, nếu không cố gắng cũng chẳng thành danh. Xưa nay chỉ có người tu thân tích đức học hành thì khi vận đến mới thành công.\n" +
                "Gieo được quẻ này, đường tài lộc phụ thuộc vào tư tưởng. Không nên quá cầu toàn, đòi hỏi tận thiện, tận mỹ. Mọi việc đạt được thành công 70 - 80% là tốt rồi. Trên đời không có người thập toàn thập mỹ, càng không có việc thập toàn thập mỹ. Ví như, hàng hóa cần đẹp, tốt, chất lượng, nhưng phải rẻ, thực dụng, hợp thời."))
        hexagrams.add(Hexagram("100010", "QUẺ TRẠCH HỎA CÁCH", R.drawable.i49, "Hán Miêu Đắc Thủy - Vận tốt đã đến.\n" +
                "Cách có nghĩa là cải cách, đổi mới, hung biến thành cát, vì vậy có hình tượng là mầm cây được nước. Hán Miêu Đắc Thủy là chuyện mầm cây do không mưa mà bị khô héo. May mà mây đen kéo đến, mưa to xối xả, mầm cây được nước phơi phới mọc lên. Kẻ gieo được quẻ này là có điềm vận tốt đã đến. Mầm cây bị hạn được nước mưa, mọc xanh tốt, giao dịch, cầu tài rất khá, hôn nhân, góp vốn đều như ý, bệnh tật, kiện tụng tiêu tan. Xuất hành đại hỉ, của mất lại về, người đi có tin, buôn bán đắc lợi..\n" +
                "Cách là thay đổi, thay cũ đổi mới. Cái cũ hỏng nát phải nên thay. Kinh dịch dùng cụm từ Trạch Trung Hữu Hỏa chỉ quẻ Cách. Trong đầm hồ có lửa là chỉ suối nước nóng. Suối nước nóng có axít có thể làm lông và thịt còn lại trên da mất đi, đó là phương pháp thuộc da. Vì vậy mới có từ Cách Tân / Đổi mới. Mục đích của đổi mới là để mọi việc hanh thông tốt đẹp. Trời đất bốn mùa thay đổi, cây cối mới phát triển. Thay đồi là việc lớn, đòi hỏi phải là người có tài, làm việc cẩn thận thì việc cải cách mới thành công. Đã cải cách phải thay đổi triệt để mới có tác dụng.\n" +
                "Gieo được quẻ Cách, đường tài vận cần cải cách về mọi mặt"))
        hexagrams.add(Hexagram("010001", "QUẺ HỎA PHONG ĐỈNH", R.drawable.i50, "Ngư ông đắc lợi - Nhất cử lưỡng tiện.\n" +
                "Đỉnh là dụng cụ nấu nướng, nấu ăn để nuôi dưỡng hiền tài. Vì vậy, nó có hình tượng người đánh cá được lợi. Ngư ông đắc lợi là chuyện một ngư ông đánh cá bên hồ thấy chim oanh mổ con trai, con trai ngậm lại giữ chặt mỏ chim oanh không chịu nhả. Ngư ông đi tới, tóm được cả hai, vô cùng đắc ý. Người geo được quẻ này có điềm Nhất Cử Lưỡng Tiện (một công, đôi việc)Lời đoán: ra đi đắc lợi, giao dịch tất thành, cầu tài có lộc, hôn nhân vui vẻ, kiện tụng bệnh tật đều tiêu tan, buôn bán phát tài. Nhất cử lưỡng tiên là may mắn gấp đôi. Hai sự việc phải là hai việc giống nhau thì mới hay. Nếu hai sự việc trái ngược nhau như ăn hỏi và giỗ kỵ cùng làm một ngày sẽ dẫn đến hậu quả vô cùng tai hại.\n" +
                "Đỉnh có nghĩa là cái vạc, một dụng cụ nấu nướng, chế biến thức ăn sống thành thức ăn chín, cái rắn thành cái mềm. Kinh dịch nói: Đỉnh, nguyên cát hanh (quẻ Đỉnh, căn bản hanh thông). Quẻ này mang đến sự tốt lành, hanh thông. Lời kinh còn viết: Mộc thượng hữu hỏa / quân tử dĩ chính vị ngưng mệnh (Trên cây có lửa là quẻ Đỉnh, người quân tử dựa vào quẻ này để làm đúng ngôi vị, suy nghĩ về sứ mệnh). Quẻ Đỉnh còn hàm nghĩa chính quyền vững vàng ổn định. Ngày xưa Tần Thủy Hoàng sau khi thống nhất Trung Quốc đã tập trung vũ khí của 6 nước thua trận đúc 9 cái đỉnh, tượng trưng cho 9 châu, để ghi công cho mình.\n" +
                "Gieo được quẻ Đỉnh, tài lộc rất tốt.Tính của quẻ này là nhún thuận, sáng suốt, vì vậy phải biết kiềm chế dục vọng, thuận theo lẽ phải mà làm thì sẽ thành công."))
        hexagrams.add(Hexagram("110110", "QUẺ THUẦN CHẤN", R.drawable.i51, "Kim chung dạ chàng - Mọi sự thành công. Chấn có nghĩa là động là chấn động, là làm cho kinh hoàng trăm dặm. Vì vậy có tượng là chuông vàng ngân vang trong đêm. Chuyện rằng: Một chiếc chuông vàng mai một lâu ngày, bỗng một hôm được treo cao, nửa đêm đánh một tiếng, tiếng chuông ngân vang, gieo được quẻ này có điềm mọi sự thành công.\n" +
                "Chấn còn hàm nghĩa sấm sét. Đức của sấm sét là: Sấm có tiếng nhưng không có lực, ai cũng sợ, nhưng không giết ai bao giờ.\n" +
                "Lời đoán: Cầu danh như ý, mọi việc tất thành, của mất lại về, người đi có tin, kinh doanh đắc lợi.\n" +
                "Lời bàn: Chuông vàng thì ngân vang, người có tài thì như câu nói \"Hữu xạ tự nhiên hương\".\n" +
                "Lời giải mọi việc thành công. Đức tu thân là nhân nghĩa, nhu thuận, khiêm cung, cầu thị. Quẻ Chấn có tượng phấn chấn, kinh sợ, biết lo sợ thì mới có thể được phúc. Biết lo sợ thì tự sửa mình, giữ mình vào khuôn phép. Bản thân quẻ Chấn đã có tính chất hanh (đạo hanh thông) nên quẻ Chấn còn nhắc nhở \"nói ít làm nhiều\", chớ sấm to, mưa nhỏ, chém gió.\n" +
                "Nhấn mạnh: Quẻ Chấn còn hàm ý trước dễ sau khó, nên phải tránh đầu voi đuôi chuột, phát triển quá nhanh, tạo thành kinh doanh bong bóng, dễ nổ vỡ, sấm có tiếng, nhưng không có lực là vậy."))
        hexagrams.add(Hexagram("011011", "QUẺ THUẦN CẤN", R.drawable.i52, "Ải Nhân Cấu Táo - Mọi việc bất thuận. Cấn có nghĩa là ngăn, là dừng lại, ngăn chặn không cho tiến, vì thế có hình tượng Anh lùn hái táo. Anh lùn muốn ăn táo, nhưng táo trên cây cao không sao lấy được. Gieo được quẻ này là \"mọi việc bất thuận\".\n" +
                "Lời đoán của quẻ Cấn: Đi không đến được, kinh doanh trục trặc, hôn nhân không thuận, góp vốn không thành, tranh cãi kiện tụng liên miên. Vì thế mọi việc phải luôn cẩn trọng đề phòng, tránh xung đột là thượng sách.\n" +
                "Lời bàn: táo chín trên cây ai chẳng muốn hái, người xinh đẹp ai chẳng muốn làm quen, song người năng lực không có, tiền tài ít, dù có muốn cũng không thể.\n" +
                "Lời giải: Cấn có nghĩa là dừng lại. Tiến lên cần có sức lực lớn, nhưng dừng lại còn cần lực lớn hơn. Con người không dừng lại được là vì dục vọng quá lớn. Lời kinh viết: Quẻ Cấn có nghĩa là dừng, lúc đáng dừng thì dừng, lúc đáng làm thì làm, làm hay không làm không để mất thời cơ. Đó là cái đạo sáng suốt vậy. Núi đè lên Núi là quẻ thuần Cấn / núi non trùng điệp là tượng của quẻ Cấn, vì vậy lý thuận là: Không làm việc gì vượt quá quyền, quá sức, quá lực của mình.\n" +
                "Gieo được quẻ này, đường tài lộc vất vả như leo núi, càng lên cao càng khó trèo. Phải hết sức cố gắng, kiên trì nhẫn nại tiếp tục leo núi. Trong kinh doanh buôn bán phải phòng ngừa \"thằng lùn\" không hái được táo, thù dai. Thằng Lùn là người cản trở công cuộc leo núi vốn đã khó khăn vất vả. Phải dừng đúng lúc dừng mới không té xuống vực."))
        hexagrams.add(Hexagram("001011", "QUẺ PHONG SƠN TIỆM", R.drawable.i53, "Hành tẩu bạc băng - Trứng để đầu đẳng. Tiệm có nghĩa là tiến từng bước, vì vậy nó có hình tượng đi trên băng mỏng. Hành tẩu bạc băng là chỉ người qua sông mùa đông. Đi đến giữa sông băng mỏng, vô cùng nguy hiểm. Anh ta vô cùng sợ hãi, rón rén đi từng bước một. Gieo được quẻ này có điềm trứng để đầu đẳng.\n" +
                "Lời đoán: Mọi việc nguy hiểm, làm ăn không thuận, quan hệ phải dĩ hoa vi quí..\n" +
                "Lời bàn: Mọi việc hết sức thận trọng, nên làm theo phương châm tiến dần từng bước. Chớ manh động, dù thời cơ thuận lợi cũng phải cảnh giác. Chớ cậy nhiều tiền của mà khinh xuất, coi thường.\n" +
                "Lời giải: Tiệm có nghĩa là đi từng bước một, tiến từ từ từng bước một. Trên núi có cây là quẻ Tiệm. Người quân tử dựa vào quẻ này mà thực hành nhân đức, hoàn thiện tục lệ. Chỉ có thể thực hành nhân đức mới có thể vượt qua được nguy hiểm trong đời.\n" +
                "Luận đoán tài vận: Gieo phải quẻ này, tuy có nguy cơ thua lỗ, nhưng chỉ cần hết sức thận trọng, làm việc cẩn thận, không quá nôn nóng trong kinh doanh buôn bán là có thể yên tâm. Nếu công việc cần quyết đoán, để chậm là mất thời cơ, cần phải tham khảo ý kiến người khác rồi mới nên quyết định. Từng bước, từng bước sẽ vượt qua được mọi khó khăn mà thành tựu."))
        hexagrams.add(Hexagram("110100", "QUẺ LÔI TRẠCH QUY MUỘI", R.drawable.i54, "Duyên mộc cầu ngư - Mưu sự bất thành. Quy muội có nghĩa là thiếu nữ theo trưởng nam, âm dương bất giao, vì vậy có hình tượng \"leo cây tìm cá\", Muốn bắt cá, leo cây làm sao tìm được cá? Đó là điềm bất thành.\n" +
                "Lời đoán: Làm việc chưa đến, việc ngược đời, mưu sự bất thành.\n" +
                "Lời bàn: Âm dương không giao hòa, mọi việc trắc trở, thời vận không thông, dù cố gắng cũng uổng công phí sức, chỗ tìm không đúng thì tìm suốt đời không ra, đối tượng không thuận, dù có tiềm lực to lớn như thế nào cũng không thành.\n" +
                "Lời giải: Uổng công vô ích. Quy muội có nghĩa là em gái út về nhà chồng, có hai mặt nghĩa của quẻ: Em gái út về nhà chồng / và em gái út đã lấy chồng, về nhà mẹ đẻ. Cảnh tượng đó trong dịch là trên đầm có sấm. Người đánh cá ra giữa hồ đánh cá, gặp sấm chớp, giông gió, phải về tay không.\n" +
                "Luận đoán tài vận: Gieo phải quẻ này, tài vận không tốt. Phải thực hành triệt để tiết kiệm, kiềm chế chi tiêu. Mọi vay mượn, cầm cố, hùn hạp để phát triển, mở rộng, khuyếch trương kinh doanh buôn bán đều thất bại. Nên dừng lại, cầu thị, học hỏi, chờ thời chưa muộn."))
        hexagrams.add(Hexagram("110010", "QUẺ PHONG LÔI HỎA", R.drawable.i55, "Cổ Kinh Trùng Minh - Vận tốt trở lại.\n" +
                "Phong có nghĩa là lớn, lấy sáng mà động, vì vậy nó có hình tượng gương cổ sáng lại. Gieo được quẻ này, có điềm vận tốt trở lại.\n" +
                "Lời bàn: Gương đã bỏ xó lâu ngày, nay lại ược dùng, thật may mắn. Thời vận trở lại, tuy có thể không bằng ngày xưa, nhưng vẫn là đại phúc.\n" +
                "Lời giải: Vận tốt trở lại. Phong có nghĩa là to lớn, thịnh vượng, vì vậy, Kinh dịch nói: Phong - đại giã / Quẻ Phong là lớn vậy. Nhưng quẻ phong còn dùng lời kinh nhắc nhở ta mọi việc phải suy xét tỏ tường đến chân tơ, kẽ tóc. Khi của cải bắt đầu có nhiều, sinh ra tranh chấp. Cổ nhân có câu: Cộng khổ dễ, đồng cam khó. Trước khi cộng tác, hùn hạp, cần minh bạch rõ ràng lời lãi, ăn chia, tránh tranh chấp kiện tụng sau này. Kinh dịch dùng cụm từ: Lôi điện giai chí (sấm chớp cùng nổi lên) để chỉ quẻ Phong. Thời cổ Lội / Điện có nghĩa là tư pháp, là hình phạt. Quẻ nhắc chúng ta phải công bằng nếu không khó tránh khỏi kiện cáo.\n" +
                "Lời đoán tài vận: Gieo được quẻ này, đường tài vận khá tốt. Vấn đề quan trọng là có ăn chia với nhau sòng phẳng công bằng, tuyệt đối hay không? Không vì cái lợi nhỏ mà hỏng việc lớn.Phân chia chỉ cần hơi lệch chút là sinh chuyện. Kinh doanh kỵ nhất là chuyện kiện tụng. Nếu rơi vào vụ kiện phải nhanh chóng thoát khỏi. Ngay cả thằng kiện cũng rất hung. Phải học cách nhân nhượng để không ai kiện mình, như vậy mới tránh khỏi tai họa."))
        hexagrams.add(Hexagram("010011", "QUẺ HỎA SƠN LỮ", R.drawable.i56, "Túc Điểu Phần sào - Việc làm không thành / Mưu sự bất thành.\n" +
                "Lữ có nghĩa là ở trọ / Ở nhờ, không thể tự do như nhà mình được, vì vậy có hình tượng chim bị đốt tổ. Gieo phải quẻ này có điềm việc làm không thành. Hình tượng quẻ Lữ: Chim làm tổ trên cành cây cao, con người dùng lửa đốt tổ, chim phải đi lang thang.\n" +
                "Lời đoàn: Xuất hành bất lợi / Người đi không về / Của mất không tìm thấy / Cầu tài không được / Kiện tụng lung tung / Buôn bán thua lỗ.\n" +
                "Lời bàn: Gieo phải quẻ này, nên xin âm dương loại bỏ, nếu không mọi việc uổng công phí sức. Nơi dương gian, xin là việc của dân, nhưng cho lại là việc của quan, dân và quan đều phải có lòng hướng thiện, thì việc mới nên.\n" +
                "Lời giải: Mưu sự bất thành. Lữ có nghĩa là đi ra ngoài / lữ hành. Dịch nói: Lữ giả / khách dã (kẻ đi ra ngoài là ở trọ, ở nhờ vậy). Lời kinh dùng câu: Sơn thượng hữu hỏa / trên núi có lửa để chí quẻ Lữ. Lửa trên núi là cảnh mặt trời lặn hoặc mọc. Thời xưa Lữ hành là việc gian khổ. Trời vừa sáng đã phải lên đường, đến khi mặt trời lặn mới tìm chổ trọ, cuộc sống vất vưởng không yên ổn. Lời kinh nói: Túc điểu phần sào / Lữ nhân tiên tiếu hậu hào diêu / (Chim bị đốt tổ, lữ khách đầu tiên thì cười, sau thì kêu gào). Lữ khách ban đầu vui vẻ, sau kêu khổ vì gian lao.\n" +
                "Luận đoán tài vận: Gieo phải quẻ Lữ, tài vận khó hanh thông, nhiều gian nan vất vả. Lữ chỉ sự mới bắt đầu, việc khó khổ chỉ mới bắt đầu, cần kiên nhẫn trải qua, không bi quan chán nản. Nhấn mạnh, chớ nên khuyếch trương kinh doanh buôn bán."))
        hexagrams.add(Hexagram("", "QUẺ ", R.drawable.i51, ""))
        hexagrams.add(Hexagram("", "QUẺ ", R.drawable.i51, ""))
        hexagrams.add(Hexagram("", "QUẺ ", R.drawable.i51, ""))
        hexagrams.add(Hexagram("", "QUẺ ", R.drawable.i51, ""))
        hexagrams.add(Hexagram("", "QUẺ ", R.drawable.i51, ""))
        hexagrams.add(Hexagram("", "QUẺ ", R.drawable.i51, ""))
        hexagrams.add(Hexagram("", "QUẺ ", R.drawable.i51, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        return hexagrams
    }
}