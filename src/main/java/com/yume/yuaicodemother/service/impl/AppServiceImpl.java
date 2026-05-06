package com.yume.yuaicodemother.service.impl;

import com.mybatisflex.spring.service.impl.ServiceImpl;
import com.yume.yuaicodemother.model.entity.App;
import com.yume.yuaicodemother.mapper.AppMapper;
import com.yume.yuaicodemother.service.AppService;
import org.springframework.stereotype.Service;

/**
 * 应用 服务层实现。
 *
 * @author <a href="https://github.com/yumestk">yumestk</a>
 */
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App>  implements AppService{

}
