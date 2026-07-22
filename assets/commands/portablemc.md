# TAGLINE

Cross-platform command-line Minecraft launcher

# TLDR

**Start** the latest release

```portablemc start```

**Start** a specific version

```portablemc start [1.16.5]```

**Search** available versions

```portablemc search```

**Search** release channel, limit results

```portablemc search --channel release -l[10]```

**Start offline** with a username

```portablemc start -u [MyUsername]```

**Log in** with a Microsoft account

```portablemc auth login```

**List** authenticated accounts

```portablemc auth list```

**Start with** an authenticated account

```portablemc start -u [username] -a```

# SYNOPSIS

**portablemc** *command* [*options*] [*args*]

# DESCRIPTION

**portablemc** is a cross-platform command-line utility for installing and launching Minecraft quickly and reliably. It supports official Mojang versions and installs popular mod loaders seamlessly, including Forge, NeoForge, Fabric, Quilt, LegacyFabric, and Babric.

It can run offline or with a Microsoft account, browse supported versions, download game files in parallel, locate a compatible system Java runtime (falling back to Mojang-provided runtimes when needed), and apply known launch fixes. Output verbosity and machine-readable modes are available for scripting.

Install via release binaries, **cargo install portablemc-cli**, AUR packages (**portablemc** / **portablemc-bin**), or nixpkgs.

# PARAMETERS

**start** [*version*]

> Install (if needed) and launch a game version. **\-u** sets the username; **\-a** uses an authenticated account. See **portablemc start --help** for JVM, directory, and loader options.

**search**

> List or search supported versions. **--channel** filters (for example **release**); **-l** limits result count.

**auth login**

> Authenticate a Microsoft account for online play.

**auth list**

> List stored authenticated accounts.

Use **portablemc --help** and subcommand **--help** for the full flag set of your installed version.

# CAVEATS

Online play requires a valid Microsoft account flow. Some unsupported architectures may need extra flags. Mod loader installs depend on upstream loader availability. Network access is required for first-time downloads.

# INSTALL

```nix: nix profile install nixpkgs#portablemc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[java](/man/java)(1), [minecraft](/man/minecraft)(1)

# RESOURCES

```[Source code](https://github.com/theorzr/portablemc)```

```[Documentation](https://docs.rs/portablemc/latest/portablemc)```

<!-- verified: 2026-07-19 -->
