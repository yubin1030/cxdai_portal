package com.cxdai.portal.tzjinterface.service;

import com.cxdai.portal.tzjinterface.exception.BusinessException;
import com.cxdai.portal.tzjinterface.vo.EncryptionKeyVo;

public interface EncryptionKeyService {

	/**
	 * 
	 * <p>
	 * Description:获取最新版本的密钥<br />
	 * </p>
	 * @author 胡建盼
	 * @version 0.1 2014年10月15日
	 * @return
	 * @throws BusinessException
	 * EncryptionKeyVo
	 */
 public EncryptionKeyVo queryNewestEncryptionKey(Integer keyId) throws BusinessException;
 
}
