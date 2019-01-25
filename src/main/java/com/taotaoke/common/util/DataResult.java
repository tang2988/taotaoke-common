/**
 * 2019年1月25日Administrator
 */
package com.taotaoke.common.util;

import java.util.List;

/**
 * @author 谢雄辉
 * @version 1.8
 * @date 2019年1月25日
 */
public class DataResult {

	public Long total;

	public List<?> rows;

	public Long getTotal() {
		return total;
	}

	public void setTotal(Long total) {
		this.total = total;
	}

	public List<?> getRows() {
		return rows;
	}

	public void setRows(List<?> rows) {
		this.rows = rows;
	}

}
