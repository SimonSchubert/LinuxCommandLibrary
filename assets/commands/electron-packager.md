# TAGLINE

Package Electron apps for distribution

# TLDR

**Package for current platform**

```electron-packager [.] [app_name]```

**Package for specific platform**

```electron-packager [.] [app_name] --platform=[darwin] --arch=[x64]```

**Package for all platforms**

```electron-packager [.] [app_name] --all```

**Specify icon**

```electron-packager [.] [app_name] --icon=[icon.icns]```

**Specify output directory**

```electron-packager [.] [app_name] --out=[dist]```

**Overwrite existing build**

```electron-packager [.] [app_name] --overwrite```

# SYNOPSIS

**electron-packager** _sourcedir_ _appname_ [_options_]

# PARAMETERS

**--platform** _platform_
> Target platform (darwin, linux, win32, mas).

**--arch** _arch_
> Target architecture (x64, arm64, ia32).

**--all**
> Build for all platforms.

**--icon** _path_
> Application icon.

**--out** _directory_
> Output directory.

**--overwrite**
> Overwrite existing output.

**--asar**
> Package as ASAR archive.

**--prune**
> Prune devDependencies.

# DESCRIPTION

**electron-packager** packages Electron applications for distribution. Creates standalone executables for macOS, Windows, and Linux from source code.

# INSTALL

```pacman: sudo pacman -S electron```

```nix: nix profile install nixpkgs#electron```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[electron](/man/electron)(1)

