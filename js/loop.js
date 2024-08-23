/*
 * Copyright (c) 2024.
 * Saman beheshtian
 * amintado@gmail.com
 * +989353466620
 * https://yiiman.ir
 */
const endNumber = 1000000000;
const startTime = process.hrtime.bigint();

for (let i = 1; i <= endNumber; i++) {
    if (i === endNumber) {
        const endTime = process.hrtime.bigint();
        console.log('End after:  ' + (Number(endTime - startTime) / 1e6) + ' milliseconds');
    }
}
