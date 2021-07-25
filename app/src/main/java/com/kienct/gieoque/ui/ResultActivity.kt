package com.kienct.gieoque.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kienct.gieoque.R
import com.kienct.gieoque.entities.Hexagram

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val hexagrams : MutableList<Hexagram> = ArrayList()
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
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))
        hexagrams.add(Hexagram("", "", 0, ""))

    }
}