# TAGLINE

Debian helper that launches Mono CLI assemblies as normal commands

# TLDR

Show the wrapper's built-in help (it deliberately ships **no manual page**)

```cli-wrapper --help```

Run a **CLI/.NET assembly** through the system's CLI runtime

```cli [path/to/program.exe]```

Show which runtime **/usr/bin/cli** currently resolves to

```update-alternatives --display cli```

Inspect the wrapper itself

```file $(command -v cli-wrapper)```

# SYNOPSIS

**cli-wrapper** [_options_]

# DESCRIPTION

**cli-wrapper** is a small helper shipped by the Mono runtime packages on Debian and its derivatives. Debian packages containing a CLI (Common Language Infrastructure, i.e. .NET) assembly do not put the `.exe` file in `/usr/bin` directly. They install a launcher that hands the assembly to whichever CLI runtime the system has selected, so a managed program can be invoked like any other native command.

The runtime is registered with `update-alternatives` under the generic name **cli**. On a typical system this resolves to **mono**, but any conforming runtime can be substituted without touching the packages that depend on it. That indirection is what allows `apt` to install .NET software independently of the runtime actually present.

The wrapper is minimal and is not meant to be run by hand: it exists so that packaging tools and the alternatives system have a stable target to point at.

# CAVEATS

Debian explicitly marks this command **UNDOCUMENTED**: `man cli-wrapper` only tells you to run it with a help switch and refers you to the Mono documentation. Its behaviour, and even its presence, varies between Mono versions, and it is absent from current `mono-runtime` packages, so it is mostly encountered on older Debian, Ubuntu, and Raspbian installs. Do not script against it; invoke **mono** or the generic **cli** alternative instead.

# HISTORY

The wrapper dates from Debian's CLI policy work in the mid-2000s, when `cli-common` and the Mono packages introduced a runtime-agnostic way to ship .NET assemblies, at a time when Mono, Portable.NET, and other runtimes still competed. Once Mono became the only practical CLI runtime in Debian, the indirection lost most of its purpose and the wrapper was gradually retired.

# SEE ALSO

[mono](/man/mono)(1), [update-alternatives](/man/update-alternatives)(1), [dotnet](/man/dotnet)(1)

# RESOURCES

```[Source code](https://github.com/mono/mono)```

```[Homepage](https://www.mono-project.com)```

```[Documentation](https://www.mono-project.com/docs/)```

<!-- verified: 2026-07-14 -->
