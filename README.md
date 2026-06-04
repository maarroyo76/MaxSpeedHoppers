# MaxSpeedHoppers

A lightweight Fabric mod that makes hoppers transfer items at maximum speed.

## What it does

In vanilla Minecraft, hoppers have a transfer cooldown of **8 ticks** between each item movement. This mod reduces that cooldown to **1 tick**, making hoppers **8× faster** than normal.

No configuration needed — just install and enjoy blazing fast item transfer.

## Installation

1. Install [Fabric Loader](https://fabricmc.net/use/installer/)
2. Download [Fabric API](https://modrinth.com/mod/fabric-api)
3. Download MaxSpeedHoppers from [Modrinth](https://modrinth.com/mod/maxspeedhoppers)
4. Place both JARs in your `.minecraft/mods/` folder

## Compatibility

| Minecraft | Java |
|-----------|------|
| 1.18.x    | 17+  |
| 1.19.x    | 17+  |
| 1.20.x    | 17+  |
| 1.21.x    | 21+  |
| 26.1.x    | 25+  |

## Building from source

Requires JDK 21.

```bash
git clone https://github.com/maarroyo76/FasterHoppers
cd FasterHoppers
./gradlew build
```

JARs are output to `versions/<mc-version>/build/libs/`.

## License

MIT — see [LICENSE](LICENSE)
