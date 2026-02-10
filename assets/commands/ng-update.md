# TAGLINE

updates Angular and dependencies with automatic migrations

# TLDR

**Check for updates**

```ng update```

**Update Angular core**

```ng update @angular/core @angular/cli```

**Update specific package**

```ng update [package-name]```

**Force update**

```ng update @angular/core --force```

**Update to next version**

```ng update @angular/core --next```

# SYNOPSIS

**ng** **update** [_packages_...] [_options_]

# PARAMETERS

**--force**
> Force update regardless of errors.

**--next**
> Update to next/prerelease version.

**--migrate-only**
> Only run migrations.

**--from** _version_
> Migrate from specific version.

**--to** _version_
> Migrate to specific version.

# DESCRIPTION

**ng update** updates Angular and dependencies with automatic migrations. Runs schematics to update code for breaking changes. Part of Angular CLI.

# SEE ALSO

[ng](/man/ng)(1), [ng-add](/man/ng-add)(1)

