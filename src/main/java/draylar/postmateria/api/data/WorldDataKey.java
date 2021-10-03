package draylar.postmateria.api.data;

import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

import java.util.function.Function;

public record WorldDataKey<T extends WorldData>(Identifier id, Function<ServerWorld, T> supplier) {
    T create(ServerWorld world) {
        return supplier.apply(world);
    }
}