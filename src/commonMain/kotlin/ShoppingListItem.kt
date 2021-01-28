import kotlinx.serialization.Serializable

@Serializable
data class ShoppingListItem(val desc: String, val priority: Int) {
    public val id: Int = desc.hashCode()

    companion object {
        const val path = "/shoppingList"
    }
}