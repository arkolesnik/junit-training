package frameworks.homework;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

@SuiteClasses({
        CreateFileTest.class
})
@RunWith(Categories.class)
@IncludeCategory(MyCategories.NegativeTests.class)
public class NegativeSuite {

}
