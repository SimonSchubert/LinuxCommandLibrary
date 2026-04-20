# TAGLINE

shows a standard balance sheet report

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

**-H**, **--historical**
> Show period-ending balances (accumulating). The default is period-change balances.

**--cumulative**
> Show cumulative balances from the report start, ignoring any opening balances.

**-T**, **--row-total**
> Add a per-row Total column.

**-A**, **--average**
> Add a per-row Average column.

**--no-total**
> Omit the final Total row.

**-d**, **--depth** _N_
> Aggregate beyond depth _N_ of the account tree.

**--pretty**
> Use Unicode box-drawing characters.

**--transpose**
> Swap rows and columns.

**--invert**
> Flip the sign on all amounts.

**-b** _DATE_
> Begin date.

**-e** _DATE_
> End date.

**-o**, **--output-file** _FILE_
> Write output to _FILE_ (format inferred from extension).

**-O**, **--output-format** _FMT_
> Force output format: `txt`, `csv`, `tsv`, `html`, `json`, `fods`, `sql`.

**--help**
> Display help information.

# DESCRIPTION

**hledger balancesheet** shows a standard balance sheet report. It displays assets, liabilities, and calculates net worth.

The report follows accounting conventions with assets on one side and liabilities on the other. Net worth is assets minus liabilities.

# CAVEATS

Requires accounts that match the queries `type:A` (assets) and `type:L` (liabilities), or top-level accounts named `assets` / `liabilities`. If equity accounts exist, consider **hledger balancesheetequity** for the full three-section statement. Alias: **bs**.

# HISTORY

Balancesheet is a standard report in **hledger** for viewing financial position at a point in time.

# SEE ALSO

[hledger](/man/hledger)(1), [hledger-balance](/man/hledger-balance)(1), [hledger-incomestatement](/man/hledger-incomestatement)(1)
