# TLDR

**Start Minecraft server**

```java -jar paper.jar```

**Start with memory limits**

```java -Xms2G -Xmx4G -jar paper.jar```

**Accept EULA**

```java -jar paper.jar --accepteula```

**Specify world folder**

```java -jar paper.jar --world-dir [worlds]```

# SYNOPSIS

**java** **-jar** paper.jar [_options_]

# PARAMETERS

**--accepteula**
> Accept EULA automatically.

**--world-dir** _DIR_
> World storage directory.

**--plugins** _DIR_
> Plugins directory.

**--config** _FILE_
> Configuration file.

**nogui**
> Start without GUI.

# DESCRIPTION

**PaperMC** is a high-performance Minecraft server. Fork of Spigot with optimizations.

The server provides improved performance. Plugin compatible with Bukkit/Spigot.

papermc runs Minecraft servers.

# CAVEATS

Requires Java. Memory allocation important. Plugin compatibility varies.

# HISTORY

PaperMC was forked from **Spigot** for improved Minecraft server performance.

# SEE ALSO

[java](/man/java)(1), [screen](/man/screen)(1)

