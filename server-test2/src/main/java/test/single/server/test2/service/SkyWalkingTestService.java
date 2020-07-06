package test.single.server.test2.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.single.server.test2.dao.SchoolDao;
import test.single.server.test2.model.SchoolSchoolInfo;

@Service
public class SkyWalkingTestService {

    private SchoolDao schoolDao;

    @Autowired
    public void setSchoolDao(SchoolDao schoolDao) {
        this.schoolDao = schoolDao;
    }

    public SchoolSchoolInfo getSchoolInfo(int serial){
        return schoolDao.getSchoolInfo(serial);
    }
}
