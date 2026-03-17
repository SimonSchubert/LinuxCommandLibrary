# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-bin
pkgver=3.7.0
pkgrel=1
pkgdesc='Linux command reference and cheat sheets for your terminal'
arch=('x86_64')
url='https://github.com/SimonSchubert/LinuxCommandLibrary'
license=('Apache-2.0')
makedepends=('unzip')
provides=('lcl')
conflicts=('lcl')

source=("LinuxCommandLibrary-${pkgver}-cli-linux-x64.zip::https://github.com/SimonSchubert/LinuxCommandLibrary/releases/download/v${pkgver}/LinuxCommandLibrary-${pkgver}-cli-linux-x64.zip")
sha256sums=('cb779f8f9ceeb86d1d87c9fcacae3608654e845dedb98e2502e13e08202f78b7')

package() {
    install -Dm755 "${srcdir}/lcl" "${pkgdir}/usr/bin/lcl"
}
