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

**satis** builds Composer repositories. It creates static mirrors.

Private Packagist alternative. Host your packages.

Static file generation. No server needed.

Mirrors public packages. Local cache.

Selective mirroring. Choose specific packages.

# CAVEATS

Requires Composer. Disk space for packages. Rebuild for updates.

# HISTORY

**Satis** is developed alongside **Composer** to provide a simple way to host private Composer package repositories.

# SEE ALSO

[composer](/man/composer)(1), [packagist](/man/packagist)(1)
