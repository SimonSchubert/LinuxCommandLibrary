# TLDR

**Generate documentation**

```phpdoc -d [src/] -t [docs/]```

**Specify config file**

```phpdoc -c [phpdoc.xml]```

**Generate with specific template**

```phpdoc -d [src/] -t [docs/] --template="clean"```

**Parse single file**

```phpdoc -f [file.php] -t [docs/]```

# SYNOPSIS

**phpdoc** [_options_]

# PARAMETERS

**-d**, **--directory** _path_
> Source directory.

**-f**, **--filename** _file_
> Single file to parse.

**-t**, **--target** _path_
> Output directory.

**-c**, **--config** _file_
> Configuration file.

**--template** _name_
> Template to use.

**--ignore** _pattern_
> Patterns to ignore.

# DESCRIPTION

**phpDocumentor** (phpdoc) generates API documentation from PHP source code. It parses DocBlock comments to create navigable HTML documentation.

# EXAMPLES

```bash
# Basic documentation
phpdoc -d ./src -t ./docs

# With configuration
phpdoc -c phpdoc.dist.xml

# Ignore tests
phpdoc -d ./src -t ./docs --ignore="tests/*"

# Verbose output
phpdoc -v -d ./src -t ./docs
```

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
<phpdocumentor>
    <paths>
        <output>docs</output>
    </paths>
    <source>
        <path>src</path>
    </source>
</phpdocumentor>
```

# CAVEATS

Requires proper DocBlocks. Large projects take time to process. Template quality varies.

# HISTORY

phpDocumentor was created by **Joshua Eichorn** and is now maintained by **Mike van Riel** and the community.

# SEE ALSO

[doxygen](/man/doxygen)(1), [php](/man/php)(1), [composer](/man/composer)(1)
