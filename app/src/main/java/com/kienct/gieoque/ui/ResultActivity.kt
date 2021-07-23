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