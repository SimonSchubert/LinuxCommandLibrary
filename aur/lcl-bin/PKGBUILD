# Maintainer: Simon Schubert <sschubert89@gmail.com>
# https://github.com/SimonSchubert/LinuxCommandLibrary

pkgname=lcl-bin
pkgver=3.6.2
pkgrel=1
pkgdesc='Linux command reference and cheat sheets for your terminal'
arch=('x86_64')
url='https://github.com/SimonSchubert/LinuxCommandLibrary'
license=('Apache-2.0')
makedepends=('unzip')
provides=('lcl')
conflicts=('lcl')

source=("LinuxCommandLibrary-${pkgver}-cli-linux-x64.zip::https://github.com/SimonSchubert/LinuxCommandLibrary/releases/download/v${pkgver}/LinuxCommandLibrary-${pkgver}-cli-linux-x64.zip")
sha256sums=('7d735ca69dea5d94b060f84a95087d96357b9cf3812c5e2a22762eb4ac059b67')

package() {
    install -Dm755 "${srcdir}/lcl" "${pkgdir}/usr/bin/lcl"
}
