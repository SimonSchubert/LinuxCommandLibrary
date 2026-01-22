# TLDR

Print **timezone** info

```zdump [timezone]```

# SYNOPSIS

**zdump** [_OPTIONS_] [_TIMEZONE..._]

# PARAMETERS

**-v**
> Verbose output with transition times

**-V**
> More verbose output

**-c** _YEAR_
> Limit transitions to specified year range

**--help**
> Display help

# DESCRIPTION

**zdump** prints timezone information including current time and UTC offset. It reads timezone data from the system timezone database.

With -v flag, it shows all timezone transitions (daylight saving time changes).

# CAVEATS

Timezone names must match system database entries. Output format varies by system version.

# SEE ALSO

[zic](/man/zic)(8), [tzselect](/man/tzselect)(8), [date](/man/date)(1)
