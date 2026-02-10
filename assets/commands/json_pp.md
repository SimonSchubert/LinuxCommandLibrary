# TAGLINE

JSON pretty printer from Perl

# TLDR

**Pretty print JSON**

```cat [data.json] | json_pp```

**Format JSON file**

```json_pp < [input.json] > [output.json]```

**Specify indentation**

```json_pp -json_opt indent [4] < [data.json]```

**Sort keys**

```json_pp -json_opt canonical < [data.json]```

**Compact output**

```json_pp -json_opt indent [0] < [data.json]```

# SYNOPSIS

**json_pp** [_options_]

# PARAMETERS

**-json_opt** _OPTIONS_
> JSON formatting options.

**indent** _N_
> Indentation level.

**canonical**
> Sort keys alphabetically.

**pretty**
> Pretty print (default).

**-f** _FORMAT_
> Input format.

**-t** _FORMAT_
> Output format.

# DESCRIPTION

**json_pp** is a JSON pretty printer from Perl. It reads JSON from stdin and outputs formatted JSON.

The tool provides basic formatting and validation. It's often pre-installed on systems with Perl.

# CAVEATS

Perl-based. Basic functionality. Consider jq for complex operations.

# HISTORY

json_pp is part of **Perl's JSON module**, providing a simple command-line JSON formatter.

# SEE ALSO

[jq](/man/jq)(1), [python -m json.tool](/man/python)(1), [jsonlint](/man/jsonlint)(1)
