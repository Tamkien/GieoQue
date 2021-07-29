package com.kienct.gieoque.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ExplanationViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Phần mềm này lấy số milli giây tính từ ngày 1/1/1970 đến thời điểm bạn gieo quẻ.\n" +
                "Giả sử vào lúc 12 giờ 34 phút 56 giây ngày 1/1/2021, giá trị milli giây là 1609479296000.\n" +
                "Chúng tôi chia số này thành 2 phần: \"1609479\" và \"296000\". Tương ứng với mỗi phần là 2 quái. Một quẻ bao gồm 2 quái: Thượng Quái ở trên, Hạ Quái ở dưới.\n" +
                "Ở mỗi phần, chúng tôi lấy tổng các chữ số chia 8 lấy dư.\n" +
                "1+6+0+9+4+7+9 = 36 chia 8 dư 4.\n" +
                "2+9+6+0+0+0 = 17 chia 8 dư 1.\n" +
                "Tương ứng vói số dư từ 0 đến 7 sẽ là các quẻ Càn, Khôn, Chấn, Ly, Đoài, Cấn, Khảm, Tốn.\n" +
                "Như vậy Thượng Quái là Đoài, Hạ Quái là Khôn, ghép lại được quẻ Trạch Địa Tụy.\n" +
                "\n" +
                "Câu hỏi thường gặp:\n" +
                "Q: Thuật toán này có tính chính xác cao không?\n" +
                "A: Tương đương độ chính xác của Phong Thủy. Nhưng Phong Thủy có chính xác không thì tôi không biết.\n" +
                "Q: Tại sao tôi gieo được quẻ tốt mà vẫn không gặp may?\n" +
                "A: Đó là do nhân phẩm."
    }
    val text: LiveData<String> = _text
}