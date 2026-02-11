# TAGLINE

Static Composer repository generator

# TLDR

**Build repository**

```satis build [satis.json] [output-dir]```

**Build specific packages**

```satis build [satis.json] [output-dir] [package1] [package2]```

**Initialize config**

```satis init [satis.json]```

**Add repository**

```satis add [https://packagist.org] [satis.json]```

**Purge old files**

```satis purge [satis.json] [output-dir]```

# SYNOPSIS

**satis** _command_ [_options_] [_args_]

# PARAMETERS

**build**
> Build repository.

**init**
> Create config.

**add**
> Add repository.

**purge**
> Remove old files.

**-n**
> No interaction.

**-v**
> Verbose output.

# DESCRIPTION

**satis** generates static Composer package repositories, providing a self-hosted alternative to Packagist for distributing private PHP packages. It reads a JSON configuration file that defines which repositories and packages to include, then generates static files that can be served by any web server.

The generated repository acts as a local mirror and cache for both private and public packages. Teams can selectively mirror specific packages from Packagist or other sources, reducing external dependencies and improving install speeds. Since the output is purely static files, no special server-side software is required beyond a basic HTTP server.

# CAVEATS

Requires Composer. Disk space for packages. Rebuild for updates.

# HISTORY

**Satis** is developed alongside **Composer** to provide a simple way to host private Composer package repositories.

# SEE ALSO

[composer](/man/composer)(1), [packagist](/man/packagist)(1)
