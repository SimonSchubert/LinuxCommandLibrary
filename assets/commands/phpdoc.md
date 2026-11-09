# TAGLINE

generates API documentation from PHP source code

# TLDR

**Generate documentation**

```phpdoc -d [src/] -t [docs/]```

**Specify config file**

```phpdoc -c [phpdoc.xml]```

**Generate with specific template**

```phpdoc -d [src/] -t [docs/] --template="clean"```

**Parse single file**

```phpdoc -f [file.php] -t [docs/]```

**Ignore paths** matching a glob

```phpdoc -d [src/] -t [docs/] -i "[tests/**/*]"```

**Include only public and protected** elements

```phpdoc -d [src/] -t [docs/] --visibility=[public,protected]```

**Force a full rebuild**, including syntax highlighted source

```phpdoc -d [src/] -t [docs/] --force --sourcecode```

# SYNOPSIS

**phpdoc** [_options_]

# PARAMETERS

**-d**, **--directory** _path_
> Directory to parse, glob patterns supported. May be repeated.

**-f**, **--filename** _file_
> File to parse, glob patterns supported. May be repeated.

**-t**, **--target** _path_
> Output directory.

**-c**, **--config** _file_
> Configuration file.

**--template** _name_
> Template to use.

**-i**, **--ignore** _pattern_
> Files and directories to ignore, relative to the source directory (supports globs, e.g., `"**/*test.php"`). May be repeated.

**--visibility** _level_
> Filter by visibility: public, protected, private, api, or internal.

**--title** _text_
> Set the project title.

**--encoding** _encoding_
> Set file encoding (default: UTF-8).

**--extensions** _ext_
> File extension to parse (default: php). May be repeated.

**--cache-folder** _path_
> Path where cache files are stored.

**--force**
> Force a full build instead of incrementing existing documentation.

**--sourcecode**, **--no-sourcecode**
> Whether to include syntax highlighted source code.

**--hidden**
> Also parse files and directories that begin with a period.

**--ignore-tags** _tag_
> Tag to ignore (package, subpackage and ignore cannot be ignored). May be repeated.

**--defaultpackagename** _name_
> Name to use for the default package.

**-m**, **--markers** _list_
> Comma-separated list of markers or tags to filter.

**--validate**
> Validate every processed file with PHP Lint (slow).

**-s**, **--setting** _key=value_
> Provide a custom setting. May be repeated.

**--list-settings**
> List available settings.

# DESCRIPTION

**phpDocumentor** (phpdoc) generates API documentation from PHP source code. It parses DocBlock comments to create navigable HTML documentation. The default command is `phpdoc run`, which can also be invoked simply as `phpdoc`. It supports configuration files (phpdoc.xml or phpdoc.dist.xml) for persistent settings and multiple output templates.

# DOCBLOCK FORMAT

```php
/**
 * Short description.
 *
 * Long description.
 *
 * @param string $name The name
 * @return bool Success status
 * @throws Exception On failure
 */
```

# CONFIGURATION (phpdoc.xml)

```xml
<?xml version="1.0"?>
<phpdocumentor configVersion="3">
    <paths>
        <output>docs</output>
    </paths>
    <version number="latest">
        <api>
            <source dsn=".">
                <path>src</path>
            </source>
        </api>
    </version>
</phpdocumentor>
```

# CAVEATS

Current versions require PHP 8.1 or higher. Requires proper DocBlocks. Large projects take time to process. Template quality varies.

# HISTORY

phpDocumentor was created by **Joshua Eichorn** and is now maintained by **Mike van Riel** and the community.

# SEE ALSO

[doxygen](/man/doxygen)(1), [php](/man/php)(1), [composer](/man/composer)(1), [phpunit](/man/phpunit)(1)

# RESOURCES

```[Source code](https://github.com/phpDocumentor/phpDocumentor)```

```[Homepage](https://phpdoc.org/)```

```[Documentation](https://docs.phpdoc.org/)```

<!-- verified: 2026-11-09 -->
