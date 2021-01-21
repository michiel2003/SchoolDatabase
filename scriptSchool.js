// JavaScript source code

new Vue({
    el: '#app',
    data() {
        return {
            info: null,
            vnaam: "",
            naam: ""
        },
    },
    methods: {
        loadStudents() {
            axios
                .get('http://localhost:8080/Students/All')
                .then(response => (this.info = response.data))
        }
        AddStudents() {
            axios
                .
        }
    },
})