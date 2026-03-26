# TAGLINE

JSON pretty printer from Perl

# TLDR

**Pretty print JSON**

```json_pp < [data.json]```

**Format JSON file to output file**

```json_pp < [input.json] > [output.json]```

**Sort keys alphabetically**

```json_pp -json_opt canonical < [data.json]```

**Output as Perl Data::Dumper format**

```json_pp -t dumper < [data.json]```

**Use multiple formatting options**

```json_pp -json_opt pretty,canonical,utf8 < [data.json]```

**Validate JSON** (output to null)

```json_pp -t null < [data.json]```

# SYNOPSIS

**json_pp** [**-v**] [**-f** _from_format_] [**-t** _to_format_] [**-json_opt** _options_]

# PARAMETERS

**-f** _FORMAT_
> Input format: json (default) or eval (Perl code).

**-t** _FORMAT_
> Output format: json (default), dumper (Data::Dumper), or null.

**-json_opt** _OPTIONS_
> Comma-separated JSON formatting options: ascii, latin1, utf8, pretty, indent, space_before, space_after, relaxed, canonical, allow_nonref, allow_singlequote, allow_barekey, allow_bignum, loose, escape_slash, indent_length.

**-v**
> Verbose mode (currently no action).

**-V**
> Print version and exit.

# DESCRIPTION

**json_pp** is a JSON::PP command utility that converts between input and output formats (one of which is JSON). It reads from stdin and outputs to stdout. Default behavior is pretty-printed JSON output.

The tool provides basic formatting and validation. It's often pre-installed on systems with Perl.

# CAVEATS

Multiple **-json_opt** values must be comma-separated in a single option, not as separate flags. Consider jq for complex JSON operations.

# HISTORY

json_pp is part of **Perl's JSON::PP module**, providing a simple command-line JSON formatter.

# SEE ALSO

[jq](/man/jq)(1), [python](/man/python)(1), [jsonlint](/man/jsonlint)(1)
