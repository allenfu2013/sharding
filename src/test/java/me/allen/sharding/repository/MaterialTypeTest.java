package me.allen.sharding.repository;

import me.allen.sharding.Application;
import me.allen.sharding.domain.MaterialType;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MaterialTypeTest {

    @Autowired
    private MaterialTypeRepository materialTypeRepository;

    @Test
    public void test() {
        MaterialType materialType = new MaterialType();
        materialType.setName("ID");

        materialTypeRepository.save(materialType);

        MaterialType type = materialTypeRepository.findOneByName("ID");
        Assert.assertEquals("ID", type.getName());
    }
}
