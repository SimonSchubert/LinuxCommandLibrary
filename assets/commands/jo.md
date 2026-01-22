# TLDR

**Create JSON object**

```jo name=[value] count:=[42]```

**Create JSON array**

```jo -a [item1] [item2] [item3]```

**Nested objects**

```jo name=[test] config=$(jo debug:=[true])```

**Read from stdin**

```echo "[value]" | jo name=@-```

**Read from file**

```jo content=@[file.txt]```

**Pretty print**

```jo -p name=[value]```

# SYNOPSIS

**jo** [_options_] [_key=value_...]

# PARAMETERS

_KEY=VALUE_
> String value assignment.

_KEY:=VALUE_
> Non-string value (number, boolean, null).

**-a**
> Create array instead of object.

**-p**
> Pretty print output.

**@**_FILE_
> Read value from file.

**@-**
> Read value from stdin.

**--help**
> Display help information.

# DESCRIPTION

**jo** creates JSON from shell arguments. It builds objects and arrays from command-line key-value pairs.

The tool enables JSON generation in shell scripts. Type hints distinguish strings from numbers and booleans.

jo generates JSON from shell.

# CAVEATS

Shell quoting important. Use := for non-strings. Nested structures via subshell.

# HISTORY

jo was created by **Jan-Piet Mens** to simplify JSON creation in shell scripts without complex quoting.

# SEE ALSO

[jq](/man/jq)(1), [jc](/man/jc)(1), [gron](/man/gron)(1)
