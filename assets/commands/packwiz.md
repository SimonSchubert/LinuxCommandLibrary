# TAGLINE

manages Minecraft modpacks

# TLDR

**Initialize modpack**

```packwiz init```

**Add mod from CurseForge**

```packwiz curseforge add [mod-name]```

**Add mod from Modrinth**

```packwiz modrinth add [mod-name]```

**Update all mods**

```packwiz update --all```

**Export to CurseForge format**

```packwiz curseforge export```

**Refresh pack index**

```packwiz refresh```

# SYNOPSIS

**packwiz** _command_ [_options_]

# PARAMETERS

**init**
> Initialize new modpack.

**curseforge**
> CurseForge operations.

**modrinth**
> Modrinth operations.

**update**
> Update mods.

**refresh**
> Refresh pack index.

**serve**
> Start HTTP server.

**--all**
> Apply to all mods.

# DESCRIPTION

**packwiz** manages Minecraft modpacks. It handles mod dependencies and updates.

Command-line modpack creation. No GUI required.

Supports CurseForge and Modrinth. Downloads mods from both platforms.

TOML-based pack format. Human-readable configuration.

# CAVEATS

Minecraft-specific tool. Requires Java for Minecraft. Mod compatibility varies.

# HISTORY

**packwiz** was created to simplify Minecraft modpack development and distribution using a text-based workflow.

# SEE ALSO

[java](/man/java)(1), [curl](/man/curl)(1)
