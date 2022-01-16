package dependencies.libs

import dependencies.Dependency
import dependencies.provider.DependencyProvider
import dependencies.provider.KaptDependencyProvider
import dependencies.values

object RoomLibs : DependencyProvider, KaptDependencyProvider {

    const val VERSION_ROOM = "2.3.0"
    const val VERSION_SQLITE = "2.1.0"

    override fun dependencies() = listOf(
        Dependency("androidx.room", "room-runtime", VERSION_ROOM),
        Dependency("androidx.room", "room-ktx", VERSION_ROOM),
        Dependency("androidx.sqlite", "sqlite-ktx", VERSION_SQLITE)
    ).values()

    override fun kaptDependencies() = listOf(
        Dependency("androidx.room", "room-compiler", VERSION_ROOM)
    ).values()
}