# TLDR

**Render R Markdown to HTML**

```Rscript -e "rmarkdown::render('[file.Rmd]')"```

**Render to PDF**

```Rscript -e "rmarkdown::render('[file.Rmd]', output_format='pdf_document')"```

**Render to Word**

```Rscript -e "rmarkdown::render('[file.Rmd]', output_format='word_document')"```

**Render with parameters**

```Rscript -e "rmarkdown::render('[file.Rmd]', params=list(year=2024))"```

# SYNOPSIS

R Markdown document processing

# DESCRIPTION

**R Markdown** combines R code with Markdown text to create dynamic documents. It can produce HTML, PDF, Word documents, presentations, dashboards, and more.

# YAML HEADER

```yaml
---
title: "My Report"
author: "Name"
date: "`r Sys.Date()`"
output:
  html_document:
    toc: true
    theme: united
---
```

# EXAMPLES

```r
# In R
library(rmarkdown)
render("report.Rmd")

# Specify output
render("report.Rmd", output_format = "pdf_document")

# With parameters
render("report.Rmd", params = list(data = "sales.csv"))
```

# CODE CHUNKS

````markdown
```{r setup, include=FALSE}
knitr::opts_chunk$set(echo = TRUE)
```

```{r plot-example, fig.width=8}
plot(cars)
```
````

# OUTPUT FORMATS

```
html_document
pdf_document (requires LaTeX)
word_document
ioslides_presentation
beamer_presentation
flexdashboard
```

# CAVEATS

Requires R and rmarkdown package. PDF needs LaTeX (tinytex). Processing can be slow.

# HISTORY

R Markdown was developed by **RStudio** (now Posit) building on knitr by **Yihui Xie**.

# SEE ALSO

[Rscript](/man/Rscript)(1), [knitr](/man/knitr)(1), [pandoc](/man/pandoc)(1)
