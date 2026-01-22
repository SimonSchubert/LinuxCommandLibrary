# TLDR

**Command grouping (current shell)**

```{ [command1]; [command2]; }```

**Brace expansion**

```echo {a,b,c}```

**Sequence expansion**

```echo {1..10}```

**Parameter expansion**

```echo ${var}```

**Create multiple files**

```touch file{1,2,3}.txt```

# SYNOPSIS

**{** _commands_**;** **}**

**{**_a_**,**_b_**,**_c_**}**

**{**_start_**..**_end_**}**

**${**_parameter_**}**

# DESCRIPTION

**{ }** (braces/curly brackets) serve multiple purposes in shell:

**Command grouping**: **{ cmd1; cmd2; }** groups commands to run in the current shell (unlike **(...)** which uses a subshell). Requires spaces after **{** and **;** before **}**.

**Brace expansion**: **{a,b,c}** expands to **a b c**. Useful for generating lists:
- **file{1,2,3}** → **file1 file2 file3**
- **{a..z}** → alphabet
- **{1..10}** → numbers 1-10
- **{01..10}** → zero-padded: 01 02 ... 10

**Parameter expansion**: **${var}** accesses variables, required for:
- Array access: **${array[0]}**
- Modifiers: **${var:-default}**
- Disambiguation: **${var}text**

# EXAMPLES

```bash
# Group with redirect
{ echo "line1"; echo "line2"; } > file.txt

# Brace expansion for backups
cp config.{txt,bak}

# Generate sequences
mkdir dir{01..12}
echo {A..Z}

# Nested expansion
echo {a,b}{1,2}  # a1 a2 b1 b2
```

# CAVEATS

Command grouping requires space after **{** and semicolon before **}**: **{ cmd; }** not **{cmd}**.

Brace expansion is not glob expansion - it happens before other expansions and doesn't check if files exist.

**{}** in find commands is the replacement string, not brace expansion.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [zsh](/man/zsh)(1)
