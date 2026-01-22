# TLDR

**Show balance sheet**

```hledger balancesheet```

**Monthly comparison**

```hledger balancesheet -M```

**Yearly comparison**

```hledger balancesheet -Y```

**Show as percentages**

```hledger balancesheet --percent```

**Tree view**

```hledger balancesheet --tree```

# SYNOPSIS

**hledger balancesheet** [_options_]

# PARAMETERS

**-M**, **--monthly**
> Monthly breakdown.

**-Q**, **--quarterly**
> Quarterly breakdown.

**-Y**, **--yearly**
> Yearly breakdown.

**--tree**
> Hierarchical view.

**--flat**
> Flat list view.

**--percent**
> Show percentages.

**-b** _DATE_
> Begin date.

**-e** _DATE_
> End date.

**--help**
> Display help information.

# DESCRIPTION

**hledger balancesheet** shows a standard balance sheet report. It displays assets, liabilities, and calculates net worth.

The report follows accounting conventions with assets on one side and liabilities on the other. Net worth is assets minus liabilities.

hledger balancesheet shows financial position.

# CAVEATS

Requires assets/liabilities account structure. Part of hledger suite. Alias: bs.

# HISTORY

Balancesheet is a standard report in **hledger** for viewing financial position at a point in time.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-balance](/man/hledger-balance)(1), [hledger-incomestatement](/man/hledger-incomestatement)(1)
