package hai.exam1.service.impl;

import hai.exam1.model.Receipt;
import hai.exam1.repository.ReceiptRepository;
import hai.exam1.service.ReceiptService;
import org.springframework.beans.factory.annotation.Autowired;

public class ReceiptServiceImpl implements ReceiptService {
    @Autowired
    private ReceiptRepository receiptRepository;
    @Override
    public Iterable<Receipt> findAll() {
        return receiptRepository.findAll();
    }
}
