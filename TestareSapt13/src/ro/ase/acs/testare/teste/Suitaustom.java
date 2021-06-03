package ro.ase.acs.testare.teste;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.ExcludeCategory;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ro.ase.acs.testare.categorii.GetPromovabilitateCategory;
import ro.ase.acs.testare.categorii.TesteNormale;

@RunWith(Categories.class)
@SuiteClasses({ TestGrupaa.class, TestGrupaCuFixture.class, TesthrupaWithDummy.class, TestPromovabilitateWithFake.class,
		TestPromovabilitateWithStub.class })
@IncludeCategory(GetPromovabilitateCategory.class)
@ExcludeCategory(TesteNormale.class)
public class Suitaustom {

}
