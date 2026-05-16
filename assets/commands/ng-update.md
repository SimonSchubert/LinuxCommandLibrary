# TAGLINE

update Angular packages and run automatic migrations

# TLDR

**List** available updates for installed Angular packages

```ng update```

**Update Angular core and CLI** together

```ng update @angular/core @angular/cli```

**Update a specific package**

```ng update [package-name]```

**Update to next/prerelease** version

```ng update @angular/core --next```

**Force update**, ignoring peer dependency mismatches

```ng update @angular/core --force```

**Run migrations only**, without changing installed versions

```ng update @angular/core --migrate-only --from=[15] --to=[16]```

**Create git commits** for each update step

```ng update @angular/core @angular/cli --create-commits```

# SYNOPSIS

**ng** **update** [_packages_...] [_options_]

# DESCRIPTION

**ng update** updates Angular packages and dependencies to a newer version and runs schematics that migrate application code for breaking changes. It is part of the **Angular CLI**.

Running **ng update** without arguments prints a list of installed packages that have newer versions available, along with the suggested update command. With one or more package names, it performs the update and executes any associated migration schematics.

The command refuses to run by default if the repository has uncommitted changes; pass **--allow-dirty** to override, or commit/stash first.

# PARAMETERS

**--allow-dirty**
> Permit updates when the working tree has modified or untracked files (default: false).

**-C**, **--create-commits**
> Create source-control commits for each update and migration step (default: false).

**--force**
> Bypass peer dependency version mismatches (default: false).

**--from** _version_
> Version to migrate from. Only valid with a single package and **--migrate-only**.

**--to** _version_
> Target version for migrations. Requires **--from** and **--migrate-only**; defaults to the detected installed version.

**--migrate-only**
> Run migration schematics only, without changing installed versions.

**--name** _name_
> Specify a particular migration to run. Only valid for a single package update.

**--next**
> Use prerelease versions (beta / release candidate) when resolving the target version.

**--verbose**
> Show additional execution details.

**--help**
> Print help.

# CAVEATS

Always commit or stash work in progress before running **ng update**; running with **--allow-dirty --force** can leave the repository in a hard-to-recover state. Migrations are written and tested for one minor version step at a time, so jumping multiple major versions in a single command is unsupported: update one major version at a time.

# HISTORY

**ng update** was introduced with the **Angular CLI 6** rewrite in **2018**, replacing the previous manual update workflow. It is part of the schematics-based tooling that powers Angular's automated migration story.

# SEE ALSO

[ng](/man/ng)(1), [ng-add](/man/ng-add)(1)
