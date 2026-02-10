# TAGLINE

parses JSON in shell scripts

# TLDR

**Extract key**

```echo '{"name":"test"}' | jshon -e name```

**Get array element**

```echo '[1,2,3]' | jshon -e 0```

**Get string value**

```echo '{"name":"test"}' | jshon -e name -u```

**Get type**

```echo '[1,2,3]' | jshon -t```

**Array length**

```echo '[1,2,3]' | jshon -l```

**Iterate array**

```echo '[1,2,3]' | jshon -a```

# SYNOPSIS

**jshon** [_options_]

# PARAMETERS

**-e** _KEY_
> Extract key or index.

**-u**
> Unpack string value.

**-t**
> Show type.

**-l**
> Show length.

**-a**
> Iterate over array.

**-s** _STRING_
> Create string.

**--help**
> Display help information.

# DESCRIPTION

**jshon** parses JSON in shell scripts. It provides simple extraction and manipulation primitives.

The tool chains operations for complex queries. It's designed for shell pipeline integration.

# CAVEATS

C-based tool. Chaining syntax. Consider jq for complex queries.

# HISTORY

jshon was created as a shell-friendly JSON parser with a pipeline-oriented interface.

# SEE ALSO

[jq](/man/jq)(1), [jo](/man/jo)(1), [json_pp](/man/json_pp)(1)
