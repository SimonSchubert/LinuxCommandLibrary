# TLDR

**Check module for** deprecations

```drupal-check [modules/custom/mymodule]```

**Check with analysis** level

```drupal-check -a [modules/custom/mymodule]```

**Check for Drupal 10** compatibility

```drupal-check --drupal-root=[.] [modules/custom/mymodule]```

**Output in format**

```drupal-check --format=[json] [path]```

**Check multiple paths**

```drupal-check [path1] [path2]```

# SYNOPSIS

**drupal-check** [_options_] _paths_...

# PARAMETERS

_PATHS_
> Directories or files to analyze.

**-a**, **--analysis**
> Run full analysis (not just deprecations).

**--drupal-root** _PATH_
> Drupal installation root.

**--format** _FORMAT_
> Output format: table, json, junit.

**-e**, **--exclude-dir** _DIR_
> Directories to exclude.

**-n**, **--no-progress**
> Disable progress bar.

**--help**
> Display help information.

# DESCRIPTION

**drupal-check** is a static analysis tool that checks Drupal code for deprecated API usage and other issues. It helps prepare modules for Drupal version upgrades by identifying code that needs updating.

The tool uses PHPStan for static analysis with Drupal-specific rules. It detects usage of deprecated functions, classes, and services that will be removed in future Drupal versions.

drupal-check is essential for maintaining Drupal modules and ensuring compatibility with upcoming releases.

# CAVEATS

Requires PHP and Composer. May have false positives. Complex dynamic code may not analyze correctly. Results depend on deprecation database currency.

# HISTORY

drupal-check was created by **Matt Glaman** to help the Drupal community prepare for Drupal 9 migration. It addresses the challenge of identifying deprecated code across large Drupal codebases.

# SEE ALSO

[drupal](/man/drupal)(1), [drush](/man/drush)(1), [phpstan](/man/phpstan)(1)
