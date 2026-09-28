# TAGLINE

launches the Minecraft game or runs a Minecraft server

# TLDR

**Launch** the official Minecraft Launcher

```minecraft-launcher```

Use a custom **working directory** instead of ~/.minecraft

```minecraft-launcher --workDir [/path/to/minecraft]```

Start the launcher with **GPU acceleration disabled** (fixes blank windows)

```minecraft-launcher --disableGPU```

Run a **dedicated server** without the GUI

```java -Xms[1G] -Xmx[4G] -jar [server.jar] nogui```

Run a server on a **custom port** and world folder

```java -Xmx[4G] -jar [server.jar] --port [25566] --world [myworld] nogui```

Generate **server.properties and eula.txt** and exit

```java -jar [server.jar] --initSettings```

**Upgrade** all chunks of a world to the current version

```java -jar [server.jar] --forceUpgrade nogui```

# SYNOPSIS

**minecraft-launcher** [_options_]

**java** [_jvm-options_] **-jar** _server.jar_ [_server-options_] [**nogui**]

# PARAMETERS

**-w**, **--workDir** _DIR_
> Launcher working directory (location of the .minecraft data).

**-l**, **--lockDir** _DIR_
> Restrict the launcher installation to the given directory.

**--clean**
> Delete the game and runtime directories from the working directory.

**--disableGPU**
> Disable GPU acceleration in the launcher UI.

**-h**, **--help**
> Display launcher help.

# SERVER OPTIONS

**nogui**, **--nogui**
> Do not open the server management window.

**--port** _PORT_
> Listen port (default 25565, overrides server.properties).

**--world** _NAME_
> World folder name to load.

**--universe** _DIR_
> Directory that contains the world folders.

**--initSettings**
> Create server.properties and eula.txt, then exit.

**--forceUpgrade**
> Convert all chunks of the world to the current game version.

**--eraseCache**
> Erase cached data during a forced upgrade.

**--safeMode**
> Load the vanilla data pack only.

**--bonusChest**
> Generate a bonus chest in new worlds.

**--demo**
> Run the server in demo mode.

# DESCRIPTION

**minecraft-launcher** is the official launcher for **Minecraft: Java Edition**. It handles Microsoft account sign-in, installation profiles, game versions, mod loaders and a bundled Java runtime, then starts the game client.

The **dedicated server** is a separate server.jar downloaded from minecraft.net and run directly with Java. On first start it writes eula.txt, which must be edited to **eula=true** before the server will run. Settings live in server.properties in the working directory.

# CAVEATS

The game requires a purchased Microsoft account. The server needs a matching Java version; recent releases require Java 21 or newer. Game options such as **--gameDir** or **--demo** are passed to the game client by the launcher and are not launcher options. Allocate memory with **-Xmx**; too little causes lag and out-of-memory crashes.

# HISTORY

Minecraft was created by **Markus "Notch" Persson** in 2009 and is developed by Mojang Studios, owned by Microsoft since 2014.

# SEE ALSO

[java](/man/java)(1), [mcli](/man/mcli)(1)

# RESOURCES

```[Homepage](https://www.minecraft.net/en-us/download)```

<!-- verified: 2026-09-29 -->
