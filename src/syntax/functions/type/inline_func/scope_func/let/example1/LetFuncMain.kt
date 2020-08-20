package syntax.functions.type.inline_func.scope_func.let.example1

/**
 *  Use the "let()" function in either of the following cases:
 *      1. execute code if a given value is not "null"
 *      2. convert a "nullable object" to another "nullable object"
 *      3. limit the scope of a single local variable
 */
fun main() {
    /*getNullablePerson()?.let {
        // will be executed if getNullablePerson() result is not-null
        promote(it)
    }*/

    // convert nullable person to nullable driversLicence
    /*val driversLicence: Licence? = getNullablePerson()?.let {
        licenceService.getDriversLicence(it)
    }*/

    /*val person4: Person = Person().getPersonDao().let { dao ->
        // scope of dao variable is limited to this block
        dao.insert(person)
    }*/
}