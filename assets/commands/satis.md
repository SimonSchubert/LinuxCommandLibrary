# TAGLINE

Static Composer repository generator

# TLDR

**Build repository**

```satis build [satis.json] [output-dir]```

**Build specific packages**

```satis build [satis.json] [output-dir] [vendor/package1] [vendor/package2]```

**Update only one repository** by URL

```satis build [satis.json] [output-dir] --repository-url [https://git.example.com/vendor/repo.git]```

**Build without user interaction** (e.g. for CI)

```satis build -n [satis.json] [output-dir]```

**Initialize config**

```satis init [satis.json]```

**Add repository**

```satis add [https://git.example.com/vendor/repo.git] [satis.json]```

**Remove repository**

```satis remove [https://git.example.com/vendor/repo.git] [satis.json]```

**Purge old archives**

```satis purge [satis.json] [output-dir]```

# SYNOPSIS

**satis** _command_ [_options_] [_args_]

# PARAMETERS

**build** [_file_] [_output-dir_] [_packages_...]
> Build the repository. The file defaults to ./satis.json.

**init** [_file_]
> Create a configuration file. Accepts **--name** and **--homepage**.

**add** _url_ [_file_]
> Add a repository URL to the configuration. Accepts **--type** (default: vcs) and **--name**.

**remove** _url_ [_file_]
> Remove a repository URL from the configuration.

**purge** [_file_] [_output-dir_] [_dry-run_]
> Delete archives that are no longer referenced.

**--repository-url** _URL_
> Only update the repository at the given URL (**build**, repeatable).

**--repository-strict**
> Also apply the repository filter when resolving dependencies (**build**).

**--branch** _BRANCH_
> Only update the given branch or version range of the specified packages (**build**).

**--no-html-output**
> Turn off the HTML view (**build**).

**--skip-errors**
> Skip download or archive errors (**build**).

**--stats**
> Display the download progress bar (**build**).

**--minify**
> Minify the output (**build**).

**-n**, **--no-interaction**
> No interaction.

**-v**
> Verbose output.

**-q**, **--quiet**
> Quiet output.

# DESCRIPTION

**satis** generates static Composer package repositories, providing a self-hosted alternative to Packagist for distributing private PHP packages. It reads a JSON configuration file that defines which repositories and packages to include, then generates static files that can be served by any web server.

The generated repository acts as a local mirror and cache for both private and public packages. Teams can selectively mirror specific packages from Packagist or other sources, reducing external dependencies and improving install speeds. Since the output is purely static files, no special server-side software is required beyond a basic HTTP server.

# CAVEATS

Requires PHP and Composer, and disk space for packages. Rebuild for updates. When run from source the command is **php bin/satis**; a **composer/satis** Docker image is also available. Do not **purge** archives that projects still reference in their **composer.lock**.

# HISTORY

**Satis** is developed alongside **Composer** to provide a simple way to host private Composer package repositories.

# SEE ALSO

[composer](/man/composer)(1), [packagist](/man/packagist)(1)

# RESOURCES

```[Source code](https://github.com/composer/satis)```

```[Documentation](https://getcomposer.org/doc/articles/handling-private-packages.md)```

<!-- verified: 2026-11-09 -->
