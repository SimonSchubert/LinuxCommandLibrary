# TAGLINE

extracts internationalization messages from Angular source code

# TLDR

**Extract messages** to messages.xlf in the project root

```ng extract-i18n```

**Extract to specific format**

```ng extract-i18n --format [xlf2]```

**Extract to output path**

```ng extract-i18n --output-path [src/locale]```

**Set the output filename**

```ng extract-i18n --output-path [src/locale] --out-file [source.xlf]```

**Extract for specific project**

```ng extract-i18n [my-app]```

# SYNOPSIS

**ng extract-i18n** [_project_] [_options_]

# PARAMETERS

**--format** _format_
> Output format: xlf (default), xlf2, xmb, json, arb, legacy-migrate. Aliases xlif, xliff, xliff2 are accepted.

**--output-path** _path_
> Output directory.

**--out-file** _file_
> Output filename.

**-c**, **--configuration** _name_
> Named builder configuration(s) from angular.json, comma-separated.

**--build-target** _target_
> Build target to extract from, as project:target[:configuration].

**--i18n-duplicate-translation** _mode_
> How to handle duplicate messages: error, ignore, warning.

**--progress**
> Log progress to the console (default true).

# DESCRIPTION

**ng extract-i18n** extracts messages marked with the **i18n** attribute in templates and **$localize** tagged strings in code, and writes a translation source file for the localization workflow. Translators produce one translated copy per locale, which is then configured in angular.json and merged at build time.

Requires the @angular/localize package (ng add @angular/localize).

# SEE ALSO

[ng](/man/ng)(1), [ng-build](/man/ng-build)(1), [ng-add](/man/ng-add)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Documentation](https://angular.dev/cli/extract-i18n)```

<!-- verified: 2026-09-29 -->
