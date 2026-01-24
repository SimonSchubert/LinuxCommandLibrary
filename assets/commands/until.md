# TLDR

**Loop until condition**

```until [condition]; do [commands]; done```

**Wait for file**

```until [ -f [file] ]; do sleep 1; done```

**Wait for process**

```until pgrep [process]; do sleep 1; done```

**Counter loop**

```until [ $i -gt 10 ]; do echo $i; i=$((i+1)); done```

# SYNOPSIS

**until** _condition_; **do** _commands_; **done**

# DESCRIPTION

**until** loops until true. It's opposite of while.

Condition checking. Loop while false.

Shell keyword. Not a command.

Same as while with negated condition. Semantic difference.

Common patterns. Wait for events.

# CAVEATS

Shell builtin. Opposite of while. Condition evaluated each iteration.

# EXAMPLES

```
until ping -c1 host &>/dev/null; do
  echo "Waiting..."
  sleep 5
done
echo "Host is up"
```

# HISTORY

**until** is a standard shell control structure available in POSIX shells, opposite of the while loop.

# SEE ALSO

[while](/man/while)(1), [for](/man/for)(1), [if](/man/if)(1)
