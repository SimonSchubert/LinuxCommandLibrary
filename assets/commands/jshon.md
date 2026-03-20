# TAGLINE

parses JSON in shell scripts

# TLDR

**Extract key**

```echo '{"name":"test"}' | jshon -e name```

**Get string value** (unquoted)

```echo '{"name":"test"}' | jshon -e name -u```

**Get array element**

```echo '[1,2,3]' | jshon -e 0```

**List object keys**

```echo '{"a":1,"b":2}' | jshon -k```

**Iterate array and unpack** values

```echo '["a","b","c"]' | jshon -a -u```

**Read from file** and extract

```jshon -F [data.json] -e name -u```

# SYNOPSIS

**jshon** [_options_]

# PARAMETERS

**-F** _PATH_
> Read JSON from a file instead of stdin.

**-S**
> Return JSON sorted by key.

**-Q**
> Quiet mode; disable error reporting on stderr.

**-C**
> Continue on recoverable errors (e.g., extracting nonexistent keys adds null).

**-I**
> In-place file editing; requires **-F**. Suppresses normal output.

**-0**
> Use null byte as delimiter for **-u** output instead of newline.

**-e** _INDEX_
> Extract value at key or array index.

**-s** _VALUE_
> Create a JSON string.

**-n** _VALUE_
> Create a JSON nonstring (number, true, false, null, {}, []).

**-u**
> Unpack (unquote) string value.

**-t**
> Show type of current value (string, number, bool, null, object, array).

**-l**
> Show length of current object or array.

**-k**
> Return newline-separated list of keys.

**-a**
> Iterate over array elements.

**-p**
> Pop the last manipulation from the stack.

**-d** _INDEX_
> Delete element at key or array index.

**-i** _INDEX_
> Insert a sub-element from the stack into the array/object underneath.

**--version**
> Print version and exit.

# DESCRIPTION

**jshon** parses, reads, and creates JSON from the shell. It replaces fragile adhoc parsers made from grep/sed/awk and heavyweight one-line parsers made from perl/python.

Operations are chained on a stack-based editing history. Each manipulation pushes a result onto the stack, and the final value is printed. The **-I** flag enables in-place editing of files.

# CAVEATS

C-based tool. Chaining syntax. Consider jq for complex queries.

# HISTORY

jshon was created as a shell-friendly JSON parser with a pipeline-oriented interface.

# SEE ALSO

[jq](/man/jq)(1), [jo](/man/jo)(1), [json_pp](/man/json_pp)(1)
