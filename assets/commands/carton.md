# TAGLINE

Perl module dependency manager

# TLDR

**Install dependencies from cpanfile**

```carton install```

**Update all dependencies**

```carton update```

**Run a command with local dependencies**

```carton exec [perl script.pl]```

**Run a Plack application**

```carton exec plackup [app.psgi]```

**Show installed modules**

```carton list```

**Install with deployment mode**

```carton install --deployment```

**Bundle dependencies into vendor directory**

```carton bundle```

# SYNOPSIS

**carton** _command_ [_options_]

# PARAMETERS

**install**
> Install dependencies specified in cpanfile.

**update** [_modules_]
> Update dependencies to latest versions.

**exec** _command_
> Execute command with local lib paths.

**list**
> List installed modules.

**bundle**
> Bundle dependencies into vendor/cache.

**check**
> Verify dependencies are satisfied.

**tree**
> Display dependency tree.

**--deployment**
> Install exact versions from cpanfile.snapshot.

**--cached**
> Install from cached archives (offline).

**--path** _directory_
> Specify local lib directory (default: local/).

# DESCRIPTION

**Carton** is a Perl module dependency manager, similar to Bundler for Ruby or npm for Node.js. It manages project-specific dependencies defined in a **cpanfile**, installing them into a local directory isolated from the system Perl.

Dependencies are specified in a cpanfile using a simple DSL. Running **carton install** creates a cpanfile.snapshot that locks exact versions, ensuring reproducible installations across environments.

The **carton exec** command runs programs with the correct library paths set, avoiding conflicts with system Perl modules. This enables multiple projects with different dependency versions to coexist on the same system.

# CONFIGURATION

**cpanfile**
> Declares project dependencies using a Perl DSL syntax.

**cpanfile.snapshot**
> Lockfile with exact resolved dependency versions for reproducible installations.

# CAVEATS

Carton requires a cpanfile; it cannot automatically detect dependencies. Large dependency trees may take significant time to resolve and install. XS modules require compilation tools. The snapshot format is not compatible between major Carton versions.

# HISTORY

Carton was created by **Tatsuhiko Miyagawa** (also creator of Plack/PSGI and cpanm) and released in **2011**. It was inspired by Bundler for Ruby and addressed the long-standing problem of managing Perl dependencies per-project rather than system-wide. The tool became an essential part of modern Perl development workflows.

# SEE ALSO

[cpanm](/man/cpanm)(1), [cpan](/man/cpan)(1), [plackup](/man/plackup)(1)
